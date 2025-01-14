package com.example.demo.service.Impl;

import java.io.File;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TestService {
    private static final Logger logger = Logger.getLogger(TestService.class.getName());

    /**
     * 重命名指定目录下的所有文件，新文件名为原文件名按_分割后的最后一部分
     * @return 处理的文件数量
     */
    public static int renameFiles() {
        String directoryPath = "D:\\work\\工作文件\\上传图片";
        int processedCount = 0;

        try {
            File directory = new File(directoryPath);
            if (!directory.exists() || !directory.isDirectory()) {
                logger.warning("目录不存在或不是一个有效的目录: " + directoryPath);
                return 0;
            }

            File[] files = directory.listFiles();
            if (files == null || files.length == 0) {
                logger.info("目录为空: " + directoryPath);
                return 0;
            }

            for (File file : files) {
                if (file.isFile()) {
                    String originalName = file.getName();
                    // 获取文件扩展名
                    String extension = "";
                    int dotIndex = originalName.lastIndexOf('.');
                    if (dotIndex > 0) {
                        extension = originalName.substring(dotIndex);
                        originalName = originalName.substring(0, dotIndex);
                    }

                    // 按_分割并获取最后一部分
                    String[] parts = originalName.split("_");
                    if (parts.length > 0) {
                        String newName = parts[parts.length - 1] + extension;
                        File newFile = new File(directory, newName);

                        // 检查新文件名是否已存在
                        int counter = 1;
                        while (newFile.exists()) {
                            String tempName = parts[parts.length - 1] + "(" + counter + ")" + extension;
                            newFile = new File(directory, tempName);
                            counter++;
                        }

                        // 重命名文件
                        if (file.renameTo(newFile)) {
                            logger.info(String.format("文件重命名成功: %s -> %s", file.getName(), newFile.getName()));
                            processedCount++;
                        } else {
                            logger.warning(String.format("文件重命名失败: %s", file.getName()));
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "处理文件时发生错误", e);
            throw new RuntimeException("文件处理失败", e);
        }

        return processedCount;
    }

    public static void main(String[] args) {
        renameFiles();
    }
}