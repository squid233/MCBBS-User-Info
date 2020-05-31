package io.github.squid233.mcbbsuserinfo.user;

import io.github.squid233.mcbbsuserinfo.Main;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 用户类的基础。
 */
public class User {

    private final int uid;
    private final String userName;
    private final String otherName;
    private final String group;
    private final int points;
    private final int popularity;
    private final int goldenNuggets;
    private final int goldenIngots;
    private final int emeralds;
    private final int netherStars;
    private final int contributes;
    private final int hearts;
    private final int diamonds;

    /**
     * <p>请注意，如果用户没有别名则填写null或""</p>
     * <p><s>需要重写{@link #toString()}方法以获得用户名</s>现在不需要了</p>
     * @param uid 用户的UID
     * @param otherName 别名
     * @param group 用户组
     * @param points 积分
     * @param popularity 人气
     * @param goldenNuggets 金粒
     * @param goldenIngots 金锭
     * @param emeralds- 绿宝石
     * @param netherStars 下界之星
     * @param contributes 贡献
     * @param hearts 爱心
     * @param diamonds 钻石
     */
    public User(
            int uid,
            @Nullable String otherName,
            @NotNull UserGroup group,
            int points,
            int popularity,
            int goldenNuggets,
            int goldenIngots,
            int emeralds,
            int netherStars,
            int contributes,
            int hearts,
            int diamonds
    ) {
        this.uid = uid;
        this.userName = this.toString();
        this.otherName = otherName;
        this.group = group.toString();
        this.points = points;
        this.popularity = popularity;
        this.goldenNuggets = goldenNuggets;
        this.goldenIngots = goldenIngots;
        this.emeralds = emeralds;
        this.netherStars = netherStars;
        this.contributes = contributes;
        this.hearts = hearts;
        this.diamonds = diamonds;
    }

    private void print() {
        System.out.println("UID：" + this.uid);
        System.out.println("用户名：" + this.userName);
        if (this.otherName != null && !this.otherName.equals("")) System.out.println("别名：" + this.otherName);
        System.out.println("用户组：" + this.group);
        System.out.println("积分：" + this.points);
        System.out.println("人气：" + this.popularity + " 点");
        System.out.println("金粒：" + this.goldenNuggets + " 粒");
        System.out.println("金锭：" + this.goldenIngots + " 块");
        System.out.println("绿宝石：" + this.emeralds + " 颗");
        System.out.println("下界之星：" + this.netherStars + " 枚");
        System.out.println("贡献：" + this.contributes + " 份");
        System.out.println("爱心：" + this.hearts + " 心");
        System.out.println("钻石：" + this.diamonds + " 颗");
    }

    public static void print(@NotNull User user) {
        user.print();
        System.out.println("要结束进程吗？(y/n)：");
        Main.exit = PrintUser.sc.nextLine();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
