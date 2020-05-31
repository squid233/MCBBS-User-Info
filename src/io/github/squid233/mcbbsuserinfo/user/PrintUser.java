package io.github.squid233.mcbbsuserinfo.user;

import io.github.squid233.mcbbsuserinfo.Main;

import java.util.Scanner;

import static io.github.squid233.mcbbsuserinfo.user.User.print;
import static io.github.squid233.mcbbsuserinfo.user.Users.*;

public class PrintUser {

    public static Scanner sc = new Scanner(System.in);

    public PrintUser() {

        System.out.println("请输入用户名：");

        String user = sc.nextLine();

        switch (user) {
            case "ToNick":
                print(ToNick);
                break;
            case "fiona":
                print(fiona);
                break;
            case "dyxxzgc":
                print(dyxxzgc);
                break;
            case "hhyx":
                print(hhyx);
                break;
            case "囧帝":
                print(囧帝);
                break;
            case "kklkit":
                print(kklkit);
                break;
            case "一周茶饭":
                print(一周茶饭);
                break;
            case "一周一个":
                print(一周一个);
                break;
            case "qaz17899":
                print(qaz17899);
                break;
            case "唯恋丶枫叶乀":
                print(唯恋丶枫叶乀);
                break;
            default:
                System.out.println("未找到用户，请检查拼写后重试！");
                System.out.println("要结束进程吗？(y/n)：");
                Main.exit = PrintUser.sc.nextLine();

        }

    }

}
