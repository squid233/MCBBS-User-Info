package io.github.squid233.mcbbsuserinfo.user;

public enum UserGroup {
    LV2 {
        @Override
        public String toString() {
            return "Lv.2 采石匠";
        }
    },
    LV3 {
        @Override
        public String toString() {
            return "Lv.3 挖沙工";
        }
    },
    LV5 {
        @Override
        public String toString() {
            return "Lv.5 农夫";
        }
    },
    LV6 {
        @Override
        public String toString() {
            return "Lv.6 手艺人";
        }
    },
    LV7 {
        @Override
        public String toString() {
            return "Lv.7 猎手";
        }
    },
    LV8 {
        @Override
        public String toString() {
            return "Lv.8 考古家";
        }
    },
    LV9 {
        @Override
        public String toString() {
            return "Lv.9 牧场主";
        }
    },
    LV10 {
        @Override
        public String toString() {
            return "Lv.10 附魔师";
        }
    },
    LVNOSPEAKING {
        @Override
        public String toString() {
            return "Lv-? 禁止发言";
        }
    },
    LVINF {
        @Override
        public String toString() {
            return "Lv.Inf 艺术家";
        }
    }
}
