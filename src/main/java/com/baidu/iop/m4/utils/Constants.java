package com.baidu.iop.m4.utils;

/**
 * @author mason
 */
public abstract class Constants {
    public static final String SYSTEM = "System";
    public static final String SERVER_PORT = "server.port";

    public abstract class Profile {
        public static final String PROFILE_ARG = "spring.profiles.active";
        public static final String PROFILE_KEY = "SPRING_PROFILES_ACTIVE";

        public static final String DEV = "dev";
        public static final String TEST = "test";
        public static final String PROD = "product";
    }

    public abstract class Authorities {
        public static final String ADMIN = "ROLE_ADMIN";
        public static final String USER = "ROLE_USER";
        public static final String ANONYMOUS = "ROLE_ANONYMOUS";
    }
}
