package io.github.squid233.mcbbsuserinfo.user;

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

    public User(
            int uid,
            @Nullable String otherName,
            @NotNull String group,
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
        this.group = group;
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

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public int getUid() {
        return this.uid;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getOtherName() {
        return this.otherName;
    }

    public String getGroup() {
        return this.group;
    }

    public int getPoints() {
        return this.points;
    }

    public int getPopularity() {
        return this.popularity;
    }

    public int getGoldenNuggets() {
        return this.goldenNuggets;
    }

    public int getGoldenIngots() {
        return this.goldenIngots;
    }

    public int getEmeralds() {
        return this.emeralds;
    }

    public int getNetherStars() {
        return this.netherStars;
    }

    public int getContributes() {
        return this.contributes;
    }

    public int getHearts() {
        return this.hearts;
    }

    public int getDiamonds() {
        return this.diamonds;
    }

}
