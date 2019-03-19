package com.example.demo

import org.springframework.util.ClassUtils

class DevToolsUtil {
    companion object {
        @JvmStatic fun isDeveloping(): Boolean {
            return ClassUtils.isPresent("org.springframework.boot.devtools.settings.DevToolsSettings",
                    ClassLoader.getSystemClassLoader())
        }
    }
}