package org.apache.commons.logging;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.apache.ivy.core.cache.ArtifactOrigin;

/* loaded from: classes8.dex */
public abstract class LogFactory {
    public static final String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
    public static final String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String FACTORY_PROPERTIES = "commons-logging.properties";
    public static final String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
    public static final String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final String PRIORITY_KEY = "priority";
    public static final String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String TCCL_KEY = "use_tccl";
    public static final String WEAK_HASHTABLE_CLASSNAME = "org.apache.commons.logging.impl.WeakHashtable";
    public static /* synthetic */ Class class$org$apache$commons$logging$LogFactory;
    public static final String diagnosticPrefix;
    public static PrintStream diagnosticsStream;
    public static Hashtable factories;
    public static volatile LogFactory nullClassLoaderFactory;
    public static final ClassLoader thisClassLoader;

    public abstract Object getAttribute(String str);

    public abstract String[] getAttributeNames();

    public abstract Log getInstance(Class cls) throws LogConfigurationException;

    public abstract Log getInstance(String str) throws LogConfigurationException;

    public abstract void release();

    public abstract void removeAttribute(String str);

    public abstract void setAttribute(String str, Object obj);

    public static final Hashtable createFactoryStore() {
        String systemProperty;
        Hashtable hashtable = null;
        try {
            systemProperty = getSystemProperty(HASHTABLE_IMPLEMENTATION_PROPERTY, null);
        } catch (SecurityException unused) {
            systemProperty = null;
        }
        if (systemProperty == null) {
            systemProperty = WEAK_HASHTABLE_CLASSNAME;
        }
        try {
            hashtable = (Hashtable) Class.forName(systemProperty).newInstance();
        } catch (Throwable th) {
            handleThrowable(th);
            if (!WEAK_HASHTABLE_CLASSNAME.equals(systemProperty)) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    public static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static void handleThrowable(Throwable th) {
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
    }

    public static LogFactory getFactory() throws IOException, LogConfigurationException {
        BufferedReader bufferedReader;
        String property;
        ClassLoader contextClassLoaderInternal = getContextClassLoaderInternal();
        if (contextClassLoaderInternal == null && isDiagnosticsEnabled()) {
            logDiagnostic("Context classloader is null.");
        }
        LogFactory cachedFactory = getCachedFactory(contextClassLoaderInternal);
        if (cachedFactory != null) {
            return cachedFactory;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[LOOKUP] LogFactory implementation requested for the first time for context classloader ");
            stringBuffer.append(objectId(contextClassLoaderInternal));
            logDiagnostic(stringBuffer.toString());
            logHierarchy("[LOOKUP] ", contextClassLoaderInternal);
        }
        Properties configurationFile = getConfigurationFile(contextClassLoaderInternal, FACTORY_PROPERTIES);
        ClassLoader classLoader = (configurationFile == null || (property = configurationFile.getProperty(TCCL_KEY)) == null || Boolean.valueOf(property).booleanValue()) ? contextClassLoaderInternal : thisClassLoader;
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String systemProperty = getSystemProperty(FACTORY_PROPERTY, null);
            if (systemProperty != null) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("[LOOKUP] Creating an instance of LogFactory class '");
                    stringBuffer2.append(systemProperty);
                    stringBuffer2.append("' as specified by system property ");
                    stringBuffer2.append(FACTORY_PROPERTY);
                    logDiagnostic(stringBuffer2.toString());
                }
                cachedFactory = newFactory(systemProperty, classLoader, contextClassLoaderInternal);
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer3.append(trim(e.getMessage()));
                stringBuffer3.append("]. Trying alternative implementations...");
                logDiagnostic(stringBuffer3.toString());
            }
        } catch (RuntimeException e2) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer4.append(trim(e2.getMessage()));
                stringBuffer4.append("] as specified by a system property.");
                logDiagnostic(stringBuffer4.toString());
            }
            throw e2;
        }
        if (cachedFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                InputStream resourceAsStream = getResourceAsStream(contextClassLoaderInternal, SERVICE_ID);
                if (resourceAsStream != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                        bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
                    }
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    if (line != null && !"".equals(line)) {
                        if (isDiagnosticsEnabled()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("[LOOKUP]  Creating an instance of LogFactory class ");
                            stringBuffer5.append(line);
                            stringBuffer5.append(" as specified by file '");
                            stringBuffer5.append(SERVICE_ID);
                            stringBuffer5.append("' which was present in the path of the context classloader.");
                            logDiagnostic(stringBuffer5.toString());
                        }
                        cachedFactory = newFactory(line, classLoader, contextClassLoaderInternal);
                    }
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                }
            } catch (Exception e3) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                    stringBuffer6.append(trim(e3.getMessage()));
                    stringBuffer6.append("]. Trying alternative implementations...");
                    logDiagnostic(stringBuffer6.toString());
                }
            }
        }
        if (cachedFactory == null) {
            if (configurationFile != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                String property2 = configurationFile.getProperty(FACTORY_PROPERTY);
                if (property2 != null) {
                    if (isDiagnosticsEnabled()) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("[LOOKUP] Properties file specifies LogFactory subclass '");
                        stringBuffer7.append(property2);
                        stringBuffer7.append("'");
                        logDiagnostic(stringBuffer7.toString());
                    }
                    cachedFactory = newFactory(property2, classLoader, contextClassLoaderInternal);
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
                }
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No properties file available to determine LogFactory subclass from..");
            }
        }
        if (cachedFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            cachedFactory = newFactory(FACTORY_DEFAULT, thisClassLoader, contextClassLoaderInternal);
        }
        if (cachedFactory != null) {
            cacheFactory(contextClassLoaderInternal, cachedFactory);
            if (configurationFile != null) {
                Enumeration<?> enumerationPropertyNames = configurationFile.propertyNames();
                while (enumerationPropertyNames.hasMoreElements()) {
                    String str = (String) enumerationPropertyNames.nextElement();
                    cachedFactory.setAttribute(str, configurationFile.getProperty(str));
                }
            }
        }
        return cachedFactory;
    }

    public static Log getLog(Class cls) throws LogConfigurationException {
        return getFactory().getInstance(cls);
    }

    public static Log getLog(String str) throws LogConfigurationException {
        return getFactory().getInstance(str);
    }

    public static void release(ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Releasing factory for classloader ");
            stringBuffer.append(objectId(classLoader));
            logDiagnostic(stringBuffer.toString());
        }
        Hashtable hashtable = factories;
        synchronized (hashtable) {
            try {
                if (classLoader == null) {
                    if (nullClassLoaderFactory != null) {
                        nullClassLoaderFactory.release();
                        nullClassLoaderFactory = null;
                    }
                } else {
                    LogFactory logFactory = (LogFactory) hashtable.get(classLoader);
                    if (logFactory != null) {
                        logFactory.release();
                        hashtable.remove(classLoader);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void releaseAll() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for all classloaders.");
        }
        Hashtable hashtable = factories;
        synchronized (hashtable) {
            try {
                Enumeration enumerationElements = hashtable.elements();
                while (enumerationElements.hasMoreElements()) {
                    ((LogFactory) enumerationElements.nextElement()).release();
                }
                hashtable.clear();
                if (nullClassLoaderFactory != null) {
                    nullClassLoaderFactory.release();
                    nullClassLoaderFactory = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e.getMessage());
                logDiagnostic(stringBuffer.toString());
            }
            throw e;
        }
    }

    public static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return directGetContextClassLoader();
    }

    private static ClassLoader getContextClassLoaderInternal() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    public static ClassLoader directGetContextClassLoader() throws LogConfigurationException {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static LogFactory getCachedFactory(ClassLoader classLoader) {
        if (classLoader == null) {
            return nullClassLoaderFactory;
        }
        return (LogFactory) factories.get(classLoader);
    }

    public static void cacheFactory(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory != null) {
            if (classLoader == null) {
                nullClassLoaderFactory = logFactory;
            } else {
                factories.put(classLoader, logFactory);
            }
        }
    }

    public static LogFactory newFactory(final String str, final ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object objDoPrivileged = AccessController.doPrivileged((PrivilegedAction<Object>) new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.2
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.createFactory(str, classLoader);
            }
        });
        if (objDoPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) objDoPrivileged;
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("An error occurred while loading the factory class:");
                stringBuffer.append(logConfigurationException.getMessage());
                logDiagnostic(stringBuffer.toString());
                throw logConfigurationException;
            }
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(objectId(objDoPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(objectId(classLoader2));
            logDiagnostic(stringBuffer2.toString());
        }
        return (LogFactory) objDoPrivileged;
    }

    public static LogFactory newFactory(String str, ClassLoader classLoader) {
        return newFactory(str, classLoader, null);
    }

    public static Object createFactory(String str, ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsLoadClass = null;
        try {
            if (classLoader != null) {
                try {
                    try {
                        clsLoadClass = classLoader.loadClass(str);
                        Class clsClass$ = class$org$apache$commons$logging$LogFactory;
                        if (clsClass$ == null) {
                            clsClass$ = class$(FACTORY_PROPERTY);
                            class$org$apache$commons$logging$LogFactory = clsClass$;
                        }
                        if (clsClass$.isAssignableFrom(clsLoadClass)) {
                            if (isDiagnosticsEnabled()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Loaded class ");
                                stringBuffer.append(clsLoadClass.getName());
                                stringBuffer.append(" from classloader ");
                                stringBuffer.append(objectId(classLoader));
                                logDiagnostic(stringBuffer.toString());
                            }
                        } else if (isDiagnosticsEnabled()) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Factory class ");
                            stringBuffer2.append(clsLoadClass.getName());
                            stringBuffer2.append(" loaded from classloader ");
                            stringBuffer2.append(objectId(clsLoadClass.getClassLoader()));
                            stringBuffer2.append(" does not extend '");
                            Class clsClass$2 = class$org$apache$commons$logging$LogFactory;
                            if (clsClass$2 == null) {
                                clsClass$2 = class$(FACTORY_PROPERTY);
                                class$org$apache$commons$logging$LogFactory = clsClass$2;
                            }
                            stringBuffer2.append(clsClass$2.getName());
                            stringBuffer2.append("' as loaded by this classloader.");
                            logDiagnostic(stringBuffer2.toString());
                            logHierarchy("[BAD CL TREE] ", classLoader);
                        }
                        return (LogFactory) clsLoadClass.newInstance();
                    } catch (ClassCastException unused) {
                        if (classLoader == thisClassLoader) {
                            boolean zImplementsLogFactory = implementsLogFactory(clsLoadClass);
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("The application has specified that a custom LogFactory implementation ");
                            stringBuffer3.append("should be used but Class '");
                            stringBuffer3.append(str);
                            stringBuffer3.append("' cannot be converted to '");
                            Class clsClass$3 = class$org$apache$commons$logging$LogFactory;
                            if (clsClass$3 == null) {
                                clsClass$3 = class$(FACTORY_PROPERTY);
                                class$org$apache$commons$logging$LogFactory = clsClass$3;
                            }
                            stringBuffer3.append(clsClass$3.getName());
                            stringBuffer3.append("'. ");
                            if (zImplementsLogFactory) {
                                stringBuffer3.append("The conflict is caused by the presence of multiple LogFactory classes ");
                                stringBuffer3.append("in incompatible classloaders. ");
                                stringBuffer3.append("Background can be found in http://commons.apache.org/logging/tech.html. ");
                                stringBuffer3.append("If you have not explicitly specified a custom LogFactory then it is likely ");
                                stringBuffer3.append("that the container has set one without your knowledge. ");
                                stringBuffer3.append("In this case, consider using the commons-logging-adapters.jar file or ");
                                stringBuffer3.append("specifying the standard LogFactory from the command line. ");
                            } else {
                                stringBuffer3.append("Please check the custom implementation. ");
                            }
                            stringBuffer3.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(stringBuffer3.toString());
                            }
                            throw new ClassCastException(stringBuffer3.toString());
                        }
                    } catch (ClassNotFoundException e) {
                        if (classLoader == thisClassLoader) {
                            if (isDiagnosticsEnabled()) {
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append("Unable to locate any class called '");
                                stringBuffer4.append(str);
                                stringBuffer4.append("' via classloader ");
                                stringBuffer4.append(objectId(classLoader));
                                logDiagnostic(stringBuffer4.toString());
                            }
                            throw e;
                        }
                    }
                } catch (NoClassDefFoundError e2) {
                    if (classLoader == thisClassLoader) {
                        if (isDiagnosticsEnabled()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("Class '");
                            stringBuffer5.append(str);
                            stringBuffer5.append("' cannot be loaded");
                            stringBuffer5.append(" via classloader ");
                            stringBuffer5.append(objectId(classLoader));
                            stringBuffer5.append(" - it depends on some other class that cannot be found.");
                            logDiagnostic(stringBuffer5.toString());
                        }
                        throw e2;
                    }
                }
            }
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("Unable to load factory class via classloader ");
                stringBuffer6.append(objectId(classLoader));
                stringBuffer6.append(" - trying the classloader associated with this LogFactory.");
                logDiagnostic(stringBuffer6.toString());
            }
            return (LogFactory) Class.forName(str).newInstance();
        } catch (Exception e3) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Unable to create LogFactory instance.");
            }
            if (clsLoadClass != null) {
                Class clsClass$4 = class$org$apache$commons$logging$LogFactory;
                if (clsClass$4 == null) {
                    clsClass$4 = class$(FACTORY_PROPERTY);
                    class$org$apache$commons$logging$LogFactory = clsClass$4;
                }
                if (!clsClass$4.isAssignableFrom(clsLoadClass)) {
                    return new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e3);
                }
            }
            return new LogConfigurationException(e3);
        }
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static boolean implementsLogFactory(Class cls) {
        boolean zIsAssignableFrom = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
                    zIsAssignableFrom = Class.forName(FACTORY_PROPERTY, false, classLoader).isAssignableFrom(cls);
                    if (zIsAssignableFrom) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                        logDiagnostic(stringBuffer.toString());
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer2.append(cls.getName());
                        stringBuffer2.append(" does not implement LogFactory.");
                        logDiagnostic(stringBuffer2.toString());
                    }
                }
            } catch (ClassNotFoundException unused) {
                logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e.getMessage());
                logDiagnostic(stringBuffer3.toString());
            } catch (SecurityException e2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e2.getMessage());
                logDiagnostic(stringBuffer4.toString());
            }
        }
        return zIsAssignableFrom;
    }

    public static InputStream getResourceAsStream(final ClassLoader classLoader, final String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.3
            @Override // java.security.PrivilegedAction
            public Object run() {
                ClassLoader classLoader2 = classLoader;
                if (classLoader2 != null) {
                    return classLoader2.getResourceAsStream(str);
                }
                return ClassLoader.getSystemResourceAsStream(str);
            }
        });
    }

    public static Enumeration getResources(final ClassLoader classLoader, final String str) {
        return (Enumeration) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.4
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    ClassLoader classLoader2 = classLoader;
                    if (classLoader2 != null) {
                        return classLoader2.getResources(str);
                    }
                    return ClassLoader.getSystemResources(str);
                } catch (IOException e) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Exception while trying to find configuration file ");
                        stringBuffer.append(str);
                        stringBuffer.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        stringBuffer.append(e.getMessage());
                        LogFactory.logDiagnostic(stringBuffer.toString());
                    }
                    return null;
                } catch (NoSuchMethodError unused) {
                    return null;
                }
            }
        });
    }

    public static Properties getProperties(final URL url) {
        return (Properties) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.5
            /* JADX WARN: Removed duplicated region for block: B:38:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.security.PrivilegedAction
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object run() throws Throwable {
                Throwable th;
                InputStream inputStream;
                StringBuffer stringBuffer;
                InputStream inputStream2 = null;
                try {
                    try {
                        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                        uRLConnection.setUseCaches(false);
                        inputStream = uRLConnection.getInputStream();
                    } catch (IOException unused) {
                        inputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (0 != 0) {
                        }
                        throw th;
                    }
                    if (inputStream == null) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                                if (LogFactory.isDiagnosticsEnabled()) {
                                    stringBuffer = new StringBuffer();
                                    stringBuffer.append("Unable to close stream for URL ");
                                    stringBuffer.append(url);
                                    LogFactory.logDiagnostic(stringBuffer.toString());
                                }
                            }
                        }
                        return null;
                    }
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStream);
                        inputStream.close();
                        return properties;
                    } catch (IOException unused3) {
                        if (LogFactory.isDiagnosticsEnabled()) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Unable to read URL ");
                            stringBuffer2.append(url);
                            LogFactory.logDiagnostic(stringBuffer2.toString());
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                                if (LogFactory.isDiagnosticsEnabled()) {
                                    stringBuffer = new StringBuffer();
                                    stringBuffer.append("Unable to close stream for URL ");
                                    stringBuffer.append(url);
                                    LogFactory.logDiagnostic(stringBuffer.toString());
                                }
                            }
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused5) {
                            if (LogFactory.isDiagnosticsEnabled()) {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("Unable to close stream for URL ");
                                stringBuffer3.append(url);
                                LogFactory.logDiagnostic(stringBuffer3.toString());
                            }
                        }
                    }
                    throw th;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Properties getConfigurationFile(ClassLoader classLoader, String str) {
        URL url;
        Enumeration resources;
        Properties properties = null;
        try {
            resources = getResources(classLoader, str);
        } catch (SecurityException unused) {
            url = null;
        }
        if (resources == null) {
            return null;
        }
        url = null;
        double d = 0.0d;
        while (resources.hasMoreElements()) {
            try {
                URL url2 = (URL) resources.nextElement();
                Properties properties2 = getProperties(url2);
                if (properties2 != null) {
                    if (properties == null) {
                        try {
                            String property = properties2.getProperty("priority");
                            d = property != null ? Double.parseDouble(property) : 0.0d;
                            if (isDiagnosticsEnabled()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("[LOOKUP] Properties file found at '");
                                stringBuffer.append(url2);
                                stringBuffer.append("'");
                                stringBuffer.append(" with priority ");
                                stringBuffer.append(d);
                                logDiagnostic(stringBuffer.toString());
                            }
                            url = url2;
                            properties = properties2;
                        } catch (SecurityException unused2) {
                            url = url2;
                            properties = properties2;
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic("SecurityException thrown while trying to find/read config files.");
                            }
                            if (isDiagnosticsEnabled()) {
                            }
                            return properties;
                        }
                    } else {
                        String property2 = properties2.getProperty("priority");
                        double d2 = property2 != null ? Double.parseDouble(property2) : 0.0d;
                        if (d2 > d) {
                            if (isDiagnosticsEnabled()) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("[LOOKUP] Properties file at '");
                                stringBuffer2.append(url2);
                                stringBuffer2.append("'");
                                stringBuffer2.append(" with priority ");
                                stringBuffer2.append(d2);
                                stringBuffer2.append(" overrides file at '");
                                stringBuffer2.append(url);
                                stringBuffer2.append("'");
                                stringBuffer2.append(" with priority ");
                                stringBuffer2.append(d);
                                logDiagnostic(stringBuffer2.toString());
                            }
                            url = url2;
                            properties = properties2;
                            d = d2;
                        } else if (isDiagnosticsEnabled()) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("[LOOKUP] Properties file at '");
                            stringBuffer3.append(url2);
                            stringBuffer3.append("'");
                            stringBuffer3.append(" with priority ");
                            stringBuffer3.append(d2);
                            stringBuffer3.append(" does not override file at '");
                            stringBuffer3.append(url);
                            stringBuffer3.append("'");
                            stringBuffer3.append(" with priority ");
                            stringBuffer3.append(d);
                            logDiagnostic(stringBuffer3.toString());
                        }
                    }
                }
            } catch (SecurityException unused3) {
            }
        }
        if (isDiagnosticsEnabled()) {
            if (properties == null) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] No properties file of name '");
                stringBuffer4.append(str);
                stringBuffer4.append("' found.");
                logDiagnostic(stringBuffer4.toString());
            } else {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[LOOKUP] Properties file of name '");
                stringBuffer5.append(str);
                stringBuffer5.append("' found at '");
                stringBuffer5.append(url);
                stringBuffer5.append('\"');
                logDiagnostic(stringBuffer5.toString());
            }
        }
        return properties;
    }

    private static String getSystemProperty(final String str, final String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.6
            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(str, str2);
            }
        });
    }

    public static PrintStream initDiagnostics() {
        try {
            String systemProperty = getSystemProperty(DIAGNOSTICS_DEST_PROPERTY, null);
            if (systemProperty == null) {
                return null;
            }
            if (systemProperty.equals("STDOUT")) {
                return System.out;
            }
            if (systemProperty.equals("STDERR")) {
                return System.err;
            }
            return new PrintStream(new FileOutputStream(systemProperty, true));
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    public static boolean isDiagnosticsEnabled() {
        return diagnosticsStream != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.print(diagnosticPrefix);
            diagnosticsStream.println(str);
            diagnosticsStream.flush();
        }
    }

    public static final void logRawDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.println(str);
            diagnosticsStream.flush();
        }
    }

    public static void logClassLoaderEnvironment(Class cls) {
        if (isDiagnosticsEnabled()) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer.append(System.getProperty("java.ext.dir"));
                logDiagnostic(stringBuffer.toString());
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Application classpath (java.class.path): ");
                stringBuffer2.append(System.getProperty("java.class.path"));
                logDiagnostic(stringBuffer2.toString());
            } catch (SecurityException unused) {
                logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoader = getClassLoader(cls);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[ENV] Class ");
                stringBuffer3.append(name);
                stringBuffer3.append(" was loaded via classloader ");
                stringBuffer3.append(objectId(classLoader));
                logDiagnostic(stringBuffer3.toString());
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Ancestry of classloader which loaded ");
                stringBuffer4.append(name);
                stringBuffer4.append(" is ");
                logHierarchy(stringBuffer4.toString(), classLoader);
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Security forbids determining the classloader for ");
                stringBuffer5.append(name);
                logDiagnostic(stringBuffer5.toString());
            }
        }
    }

    public static void logHierarchy(String str, ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            if (classLoader != null) {
                String string = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(objectId(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(string);
                stringBuffer.append("'");
                logDiagnostic(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(objectId(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    logDiagnostic(stringBuffer3.toString());
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                logDiagnostic(stringBuffer4.toString());
            }
        }
    }

    public static String objectId(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    static {
        String strObjectId;
        Class clsClass$ = class$org$apache$commons$logging$LogFactory;
        if (clsClass$ == null) {
            clsClass$ = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = clsClass$;
        }
        ClassLoader classLoader = getClassLoader(clsClass$);
        thisClassLoader = classLoader;
        if (classLoader == null) {
            strObjectId = "BOOTLOADER";
        } else {
            try {
                strObjectId = objectId(classLoader);
            } catch (SecurityException unused) {
                strObjectId = ArtifactOrigin.UNKNOWN;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactory from ");
        stringBuffer.append(strObjectId);
        stringBuffer.append("] ");
        diagnosticPrefix = stringBuffer.toString();
        diagnosticsStream = initDiagnostics();
        Class clsClass$2 = class$org$apache$commons$logging$LogFactory;
        if (clsClass$2 == null) {
            clsClass$2 = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = clsClass$2;
        }
        logClassLoaderEnvironment(clsClass$2);
        factories = createFactoryStore();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }
}
