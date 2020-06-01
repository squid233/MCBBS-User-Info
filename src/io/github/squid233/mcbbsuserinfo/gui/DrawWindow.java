package io.github.squid233.mcbbsuserinfo.gui;

import io.github.squid233.mcbbsuserinfo.user.User;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

import static io.github.squid233.mcbbsuserinfo.user.Users.*;

public class DrawWindow {
    // 统计信息保留字
    private String uid = "UID：";
    private String userName = "用户名：";
    private String otherName = "别名：";
    private String group = "用户组：";
    private String points = "积分：";
    private String popularity = "人气：";
    private String goldenNuggets = "金粒：";
    private String goldenIngots = "金锭：";
    private String emeralds = "绿宝石：";
    private String netherStars = "下界之星：";
    private String contributes = "贡献：";
    private String hearts = "爱心：";
    private String diamonds = "钻石：";

    private final JLabel label = new JLabel(
            "<html><body>"
                    + uid + "<br>"
                    + userName + "<br>"
                    + otherName + "<br>"
                    + group + "<br>"
                    + points + "<br>"
                    + popularity + "<br>"
                    + goldenNuggets + "<br>"
                    + goldenIngots + "<br>"
                    + emeralds + "<br>"
                    + netherStars + "<br>"
                    + contributes + "<br>"
                    + hearts + "<br>"
                    + diamonds + "<br>"
                    + "</body></html>"
    );

    // 头像
    final JPanel avatar = new JPanel();
    final JLabel avatarL = new JLabel();

    public DrawWindow() throws MalformedURLException {
        // 切换成系统默认风格，而不是Java风格
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        // 设置一个漂亮的外观
        JFrame.setDefaultLookAndFeelDecorated(true);
        // 顶级框架
        JFrame frame = new JFrame("MCBBS User Info");
        // 按钮
        JButton button = new JButton("查看统计信息");
        // 为左侧信息保留的面板
        JPanel panel = new JPanel();
        // 为底层输入用户名保留的面板
        JPanel bottom = new JPanel();
        // 背景面板
        JPanel bg = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    g.drawImage(new ImageIcon(new URL("https://www.mcbbs.net/template/mcbbs/image/logo_sc.png")).getImage(), 0, 0, 279, 95, this);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            }
        };
        // 请输入用户名文本
        JLabel eUsernameL = new JLabel("请输入用户名：");
        // 用于输入用户名的文本框
        JTextArea usernameArea = new JTextArea();
        // 关闭时把进程顺带关闭
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置图标
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(new URL("https://www.mcbbs.net/uc_server/avatar.php?uid=2149067&size=big")));
        // 使窗口居中
        frame.setLocationRelativeTo(null);
        // 设置位置在x:500,y:200,长度640,高度480
        frame.setBounds(500, 200, 640, 480);
        // 设置背景色
        bg.setBackground(Color.decode("#FBF2DB"));
        panel.setBackground(Color.decode("#FBF2DB"));
        bottom.setBackground(Color.decode("#FBF2DB"));
        avatar.setBackground(Color.decode("#FBF2DB"));
        // 添加背景图片
        frame.getContentPane().add(bg, BorderLayout.CENTER);
        // 添加头像面板
        frame.getContentPane().add(avatar, BorderLayout.EAST);
        // 添加左侧面板
        frame.getContentPane().add(panel, BorderLayout.WEST);
        // 添加底层面板
        frame.getContentPane().add(bottom, BorderLayout.SOUTH);
        // 设置字体
        label.setFont(new Font("黑体", Font.PLAIN, 15));
        // 点击查看统计信息按钮时发生的事情
        button.addActionListener(e -> {
            switch (usernameArea.getText()) {
                case "squid233":
                    try {
                        setText(squid233);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "ToNick":
                    try {
                        setText(ToNick);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "fiona":
                    try {
                        setText(fiona);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "dyxxzgc":
                    try {
                        setText(dyxxzgc);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "hhyx":
                    try {
                        setText(hhyx);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "囧帝":
                    try {
                        setText(囧帝);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "kklkit":
                    try {
                        setText(kklkit);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "一周茶饭":
                    try {
                        setText(一周茶饭);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "一周一个":
                    try {
                        setText(一周一个);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "qaz17899":
                    try {
                        setText(qaz17899);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "唯恋丶枫叶乀":
                    try {
                        setText(唯恋丶枫叶乀);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "Miku_Fans":
                    try {
                        setText(Miku_Fans);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "lhcz276045268":
                    try {
                        setText(lhcz276045268);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "快乐的蓝精灵":
                    try {
                        setText(快乐的蓝精灵);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                // 14号用户不存在
                case "素履信游":
                    try {
                        setText(素履信游);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                // 16号用户不存在
                case "蜗牛与蚂蚁":
                    try {
                        setText(蜗牛与蚂蚁);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "wzx1996":
                    try {
                        setText(wzx1996);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "啊飞flying":
                    try {
                        setText(啊飞flying);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "outsidero":
                    try {
                        setText(outsidero);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "xqx145236":
                    try {
                        setText(xqx145236);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "Mr_Snake":
                    try {
                        setText(Mr_Snake);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "lzq1993":
                    try {
                        setText(lzq1993);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "张金":
                    try {
                        setText(张金);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "花若风":
                    try {
                        setText(花若风);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "NC_jianchuan":
                    try {
                        setText(NC_jianchuan);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "wjwrh":
                    try {
                        setText(wjwrh);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "q2392736206":
                    try {
                        setText(q2392736206);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "mcboxv":
                    try {
                        setText(mcboxv);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "EmptyLava":
                    try {
                        setText(EmptyLava);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "もぺもぺ":
                    try {
                        setText(もぺもぺ);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "Xi_Lixjdj":
                    try {
                        setText(Xi_Lixjdj);
                    } catch (MalformedURLException malformedURLException) {
                        malformedURLException.printStackTrace();
                    }
                    break;
                case "baka-4n":
                    try {
                        setText(baka4n);
                    } catch (MalformedURLException exception) {
                        exception.printStackTrace();
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(panel, "未找到用户，请检查拼写后重试！", "未找到用户", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        // 为左侧面板添加信息
        panel.add(label);
        // 为底层面板添加按钮
        bottom.add(eUsernameL);
        bottom.add(usernameArea);
        bottom.add(button);
        // 为头像面板添加图片
        avatar.add(avatarL);
        // 设为可见
        frame.setVisible(true);
    }

    private void setText(@NotNull User user) throws MalformedURLException {
        uid = "UID：";
        userName = "用户名：";
        otherName = "别名：";
        group = "用户组：";
        points = "积分：";
        popularity = "人气：";
        goldenNuggets = "金粒：";
        goldenIngots = "金锭：";
        emeralds = "绿宝石：";
        netherStars = "下界之星：";
        contributes = "贡献：";
        hearts = "爱心：";
        diamonds = "钻石：";
        uid += user.getUid();
        userName += user.getUserName();
        if (user.getOtherName() != null && !user.getOtherName().equals("")) otherName += user.getOtherName();
        group += user.getGroup();
        points += user.getPoints();
        popularity += (user.getPopularity() + " 点");
        goldenNuggets += (user.getGoldenNuggets() + " 粒");
        goldenIngots += (user.getGoldenIngots() + " 块");
        emeralds += (user.getEmeralds() + " 颗");
        netherStars += (user.getNetherStars() + " 枚");
        contributes += (user.getContributes() + " 份");
        hearts += (user.getHearts() + " 心");
        diamonds += (user.getDiamonds() + " 颗");
        label.setText("<html><body>"
                + uid + "<br>"
                + userName + "<br>"
                + otherName + "<br>"
                + group + "<br>"
                + points + "<br>"
                + popularity + "<br>"
                + goldenNuggets + "<br>"
                + goldenIngots + "<br>"
                + emeralds + "<br>"
                + netherStars + "<br>"
                + contributes + "<br>"
                + hearts + "<br>"
                + diamonds + "<br>"
                + "</body></html>");
        avatarL.setIcon(new ImageIcon(new URL("https://www.mcbbs.net/uc_server/avatar.php?uid="+ user.getUid() + "&size=big")));
    }

}
