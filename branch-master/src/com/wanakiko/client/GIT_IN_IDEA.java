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
        System.out.println(UUID.randomUUID().toString().toUpperCase());
        System.out.println(ThreadLocalRandom.current().nextInt(99) + 1);
    }
}
