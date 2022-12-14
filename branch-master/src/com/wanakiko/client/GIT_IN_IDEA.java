package com.wanakiko.client;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/*
 * @author: WanAkiko
 * @date: 2022-10-12
 * @description: 演示Git的高频命令
 * @version:1.0
 */
public class GIT_IN_IDEA {
    public static void main(String[] args) {
        System.out.println("UUID：[ " + UUID.randomUUID().toString().toUpperCase() + " ]");
        System.out.println("本轮随机数：" + ThreadLocalRandom.current().nextInt(99) + 1);
        System.out.println("红色表示未追踪，绿色表示已追踪，黑色表示已提交，蓝色表示已提交且出现新的修改");
        System.out.println("DEVELOP：鼠标右键选择Git，然后点击New Branch填写分支名称即可创建新的分支。");
        System.out.println("MASTER：master分支与develop分支的同一个位置出现不同的修改。");
        System.out.println("DEVELOP：此处编辑的内容用于演示出现冲突时的分支合并。");
        System.out.println("IntelliJ IDEA Push code to Github.");
        System.out.println("信息：2022-10-13，在PC端网页修改当前类的内容，用于演示代码拉取与合并。");
    }
}
