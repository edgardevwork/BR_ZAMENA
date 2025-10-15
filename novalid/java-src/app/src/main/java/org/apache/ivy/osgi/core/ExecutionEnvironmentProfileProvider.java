package org.apache.ivy.osgi.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes5.dex */
public class ExecutionEnvironmentProfileProvider {
    public static final String DEFAULT_PROFILES_FILE = "jvm-packages.properties";
    public static final ExecutionEnvironmentProfileProvider INSTANCE;
    public static final String PACKAGE_PREFIX = "org/apache/ivy/osgi/core/";
    public Map<String, ExecutionEnvironmentProfile> profileList = loadDefaultProfileList();

    static {
        try {
            INSTANCE = new ExecutionEnvironmentProfileProvider();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ExecutionEnvironmentProfileProvider getInstance() {
        return INSTANCE;
    }

    public ExecutionEnvironmentProfile getProfile(String str) {
        return this.profileList.get(str);
    }

    public static Map<String, ExecutionEnvironmentProfile> loadDefaultProfileList() throws IOException {
        InputStream resourceAsStream = ExecutionEnvironmentProfileProvider.class.getClassLoader().getResourceAsStream("org/apache/ivy/osgi/core/jvm-packages.properties");
        if (resourceAsStream == null) {
            throw new FileNotFoundException("org/apache/ivy/osgi/core/jvm-packages.properties not found in the classpath");
        }
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            resourceAsStream.close();
            HashMap map = new HashMap();
            Iterator it = properties.entrySet().iterator();
            while (it.hasNext()) {
                String str = (String) ((Map.Entry) it.next()).getKey();
                if (str.endsWith(".pkglist")) {
                    String strSubstring = str.substring(0, str.length() - 8);
                    if (!map.containsKey(strSubstring)) {
                        loadProfile(properties, map, strSubstring);
                    }
                }
            }
            return map;
        } catch (Throwable th) {
            resourceAsStream.close();
            throw th;
        }
    }

    public static ExecutionEnvironmentProfile loadProfile(Properties properties, Map<String, ExecutionEnvironmentProfile> map, String str) {
        ExecutionEnvironmentProfile executionEnvironmentProfile = new ExecutionEnvironmentProfile(str);
        String property = properties.getProperty(str + ".extends");
        if (property != null) {
            ExecutionEnvironmentProfile executionEnvironmentProfileLoadProfile = map.get(property);
            if (executionEnvironmentProfileLoadProfile == null) {
                executionEnvironmentProfileLoadProfile = loadProfile(properties, map, property);
            }
            executionEnvironmentProfile.pkgNames.addAll(executionEnvironmentProfileLoadProfile.pkgNames);
        }
        String[] strArrSplitToArray = StringUtils.splitToArray(properties.getProperty(str + ".pkglist"));
        int length = strArrSplitToArray.length;
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplitToArray[i];
            if (!str2.isEmpty()) {
                executionEnvironmentProfile.pkgNames.add(str2);
            }
        }
        map.put(str, executionEnvironmentProfile);
        String property2 = properties.getProperty(str + ".aliases");
        if (property2 != null) {
            for (String str3 : StringUtils.splitToArray(property2)) {
                if (!str3.isEmpty()) {
                    ExecutionEnvironmentProfile executionEnvironmentProfile2 = new ExecutionEnvironmentProfile(str3);
                    executionEnvironmentProfile2.pkgNames = executionEnvironmentProfile.pkgNames;
                    map.put(str3, executionEnvironmentProfile2);
                }
            }
        }
        Message.verbose("Execution environment profile " + executionEnvironmentProfile.getName() + " loaded");
        return executionEnvironmentProfile;
    }
}
