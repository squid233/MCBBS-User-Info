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
            default:
                System.out.println("未找到用户，请检查拼写后重试！");
                System.out.println("要结束进程吗？(y/n)：");
                Main.exit = PrintUser.sc.nextLine();
        }

    }

}
