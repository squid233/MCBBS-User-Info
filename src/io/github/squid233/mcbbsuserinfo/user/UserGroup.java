package io.github.squid233.mcbbsuserinfo.user;

public enum UserGroup {
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
