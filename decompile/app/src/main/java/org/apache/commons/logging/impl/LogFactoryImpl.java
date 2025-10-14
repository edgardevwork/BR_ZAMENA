package org.apache.commons.logging.impl;

import com.google.common.reflect.ClassPath;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Hashtable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;
import org.apache.ivy.core.cache.ArtifactOrigin;

/* loaded from: classes7.dex */
public class LogFactoryImpl extends LogFactory {
    public static final String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    public static final String LOG_PROPERTY = "org.apache.commons.logging.Log";
    public static final String LOG_PROPERTY_OLD = "org.apache.commons.logging.log";
    public static final String PKG_IMPL = "org.apache.commons.logging.impl.";
    public static final int PKG_LEN = 32;
    public static /* synthetic */ Class class$java$lang$String;
    public static /* synthetic */ Class class$org$apache$commons$logging$Log;
    public static /* synthetic */ Class class$org$apache$commons$logging$LogFactory;
    public static /* synthetic */ Class class$org$apache$commons$logging$impl$LogFactoryImpl;
    public boolean allowFlawedContext;
    public boolean allowFlawedDiscovery;
    public boolean allowFlawedHierarchy;
    public String diagnosticPrefix;
    public String logClassName;
    public Class[] logConstructorSignature;
    public Method logMethod;
    public Class[] logMethodSignature;
    public static final String LOGGING_IMPL_LOG4J_LOGGER = "org.apache.commons.logging.impl.Log4JLogger";
    public static final String LOGGING_IMPL_JDK14_LOGGER = "org.apache.commons.logging.impl.Jdk14Logger";
    public static final String LOGGING_IMPL_LUMBERJACK_LOGGER = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
    public static final String LOGGING_IMPL_SIMPLE_LOGGER = "org.apache.commons.logging.impl.SimpleLog";
    public static final String[] classesToDiscover = {LOGGING_IMPL_LOG4J_LOGGER, LOGGING_IMPL_JDK14_LOGGER, LOGGING_IMPL_LUMBERJACK_LOGGER, LOGGING_IMPL_SIMPLE_LOGGER};
    public boolean useTCCL = true;
    public Hashtable attributes = new Hashtable();
    public Hashtable instances = new Hashtable();
    public Constructor logConstructor = null;

    public LogFactoryImpl() {
        Class clsClass$ = class$java$lang$String;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.String");
            class$java$lang$String = clsClass$;
        }
        this.logConstructorSignature = new Class[]{clsClass$};
        this.logMethod = null;
        Class clsClass$2 = class$org$apache$commons$logging$LogFactory;
        if (clsClass$2 == null) {
            clsClass$2 = class$(LogFactory.FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = clsClass$2;
        }
        this.logMethodSignature = new Class[]{clsClass$2};
        initDiagnostics();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Instance created.");
        }
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public String[] getAttributeNames() {
        return (String[]) this.attributes.keySet().toArray(new String[this.attributes.size()]);
    }

    @Override // org.apache.commons.logging.LogFactory
    public Log getInstance(Class cls) throws LogConfigurationException {
        return getInstance(cls.getName());
    }

    @Override // org.apache.commons.logging.LogFactory
    public Log getInstance(String str) throws LogConfigurationException {
        Log log = (Log) this.instances.get(str);
        if (log != null) {
            return log;
        }
        Log logNewInstance = newInstance(str);
        this.instances.put(str, logNewInstance);
        return logNewInstance;
    }

    @Override // org.apache.commons.logging.LogFactory
    public void release() {
        logDiagnostic("Releasing all known loggers");
        this.instances.clear();
    }

    @Override // org.apache.commons.logging.LogFactory
    public void removeAttribute(String str) {
        this.attributes.remove(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public void setAttribute(String str, Object obj) {
        if (this.logConstructor != null) {
            logDiagnostic("setAttribute: call too late; configuration already performed.");
        }
        if (obj == null) {
            this.attributes.remove(str);
        } else {
            this.attributes.put(str, obj);
        }
        if (str.equals(LogFactory.TCCL_KEY)) {
            this.useTCCL = obj != null && Boolean.valueOf(obj.toString()).booleanValue();
        }
    }

    public static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return LogFactory.getContextClassLoader();
    }

    public static boolean isDiagnosticsEnabled() {
        return LogFactory.isDiagnosticsEnabled();
    }

    public static ClassLoader getClassLoader(Class cls) {
        return LogFactory.getClassLoader(cls);
    }

    public final void initDiagnostics() {
        String strObjectId;
        ClassLoader classLoader = getClassLoader(getClass());
        if (classLoader == null) {
            strObjectId = "BOOTLOADER";
        } else {
            try {
                strObjectId = LogFactory.objectId(classLoader);
            } catch (SecurityException unused) {
                strObjectId = ArtifactOrigin.UNKNOWN;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactoryImpl@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(strObjectId);
        stringBuffer.append("] ");
        this.diagnosticPrefix = stringBuffer.toString();
    }

    public void logDiagnostic(String str) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.diagnosticPrefix);
            stringBuffer.append(str);
            LogFactory.logRawDiagnostic(stringBuffer.toString());
        }
    }

    public String getLogClassName() throws LogConfigurationException {
        if (this.logClassName == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logClassName;
    }

    public Constructor getLogConstructor() throws LogConfigurationException {
        if (this.logConstructor == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logConstructor;
    }

    public boolean isJdk13LumberjackAvailable() {
        return isLogLibraryAvailable("Jdk13Lumberjack", LOGGING_IMPL_LUMBERJACK_LOGGER);
    }

    public boolean isJdk14Available() {
        return isLogLibraryAvailable("Jdk14", LOGGING_IMPL_JDK14_LOGGER);
    }

    public boolean isLog4JAvailable() {
        return isLogLibraryAvailable("Log4J", LOGGING_IMPL_LOG4J_LOGGER);
    }

    public Log newInstance(String str) throws LogConfigurationException {
        Log logDiscoverLogImplementation;
        try {
            Constructor constructor = this.logConstructor;
            if (constructor == null) {
                logDiscoverLogImplementation = discoverLogImplementation(str);
            } else {
                logDiscoverLogImplementation = (Log) constructor.newInstance(str);
            }
            Method method = this.logMethod;
            if (method != null) {
                method.invoke(logDiscoverLogImplementation, this);
            }
            return logDiscoverLogImplementation;
        } catch (InvocationTargetException e) {
            e = e;
            Throwable targetException = e.getTargetException();
            if (targetException != null) {
                e = targetException;
            }
            throw new LogConfigurationException(e);
        } catch (LogConfigurationException e2) {
            throw e2;
        } catch (Throwable th) {
            LogFactory.handleThrowable(th);
            throw new LogConfigurationException(th);
        }
    }

    public static ClassLoader getContextClassLoaderInternal() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.impl.LogFactoryImpl.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    public static String getSystemProperty(final String str, final String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.impl.LogFactoryImpl.2
            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(str, str2);
            }
        });
    }

    public final ClassLoader getParentClassLoader(final ClassLoader classLoader) {
        try {
            return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.impl.LogFactoryImpl.3
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return classLoader.getParent();
                }
            });
        } catch (SecurityException unused) {
            logDiagnostic("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    public final boolean isLogLibraryAvailable(String str, String str2) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Checking for '");
            stringBuffer.append(str);
            stringBuffer.append("'.");
            logDiagnostic(stringBuffer.toString());
        }
        try {
            if (createLogFromClass(str2, getClass().getName(), false) == null) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Did not find '");
                    stringBuffer2.append(str);
                    stringBuffer2.append("'.");
                    logDiagnostic(stringBuffer2.toString());
                }
                return false;
            }
            if (!isDiagnosticsEnabled()) {
                return true;
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Found '");
            stringBuffer3.append(str);
            stringBuffer3.append("'.");
            logDiagnostic(stringBuffer3.toString());
            return true;
        } catch (LogConfigurationException unused) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Logging system '");
                stringBuffer4.append(str);
                stringBuffer4.append("' is available but not useable.");
                logDiagnostic(stringBuffer4.toString());
            }
            return false;
        }
    }

    public final String getConfigurationValue(String str) {
        String systemProperty;
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            logDiagnostic(stringBuffer.toString());
        }
        Object attribute = getAttribute(str);
        if (attribute != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(attribute);
                stringBuffer2.append("] for ");
                stringBuffer2.append(str);
                logDiagnostic(stringBuffer2.toString());
            }
            return attribute.toString();
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            logDiagnostic(stringBuffer3.toString());
        }
        try {
            systemProperty = getSystemProperty(str, null);
        } catch (SecurityException unused) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Security prevented reading system property ");
                stringBuffer4.append(str);
                logDiagnostic(stringBuffer4.toString());
            }
        }
        if (systemProperty != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Found system property [");
                stringBuffer5.append(systemProperty);
                stringBuffer5.append("] for ");
                stringBuffer5.append(str);
                logDiagnostic(stringBuffer5.toString());
            }
            return systemProperty;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[ENV] No system property found for property ");
            stringBuffer6.append(str);
            logDiagnostic(stringBuffer6.toString());
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("[ENV] No configuration defined for item ");
            stringBuffer7.append(str);
            logDiagnostic(stringBuffer7.toString());
        }
        return null;
    }

    public final boolean getBooleanConfiguration(String str, boolean z) {
        String configurationValue = getConfigurationValue(str);
        return configurationValue == null ? z : Boolean.valueOf(configurationValue).booleanValue();
    }

    public final void initConfiguration() {
        this.allowFlawedContext = getBooleanConfiguration(ALLOW_FLAWED_CONTEXT_PROPERTY, true);
        this.allowFlawedDiscovery = getBooleanConfiguration(ALLOW_FLAWED_DISCOVERY_PROPERTY, true);
        this.allowFlawedHierarchy = getBooleanConfiguration(ALLOW_FLAWED_HIERARCHY_PROPERTY, true);
    }

    public final Log discoverLogImplementation(String str) throws LogConfigurationException {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Discovering a Log implementation...");
        }
        initConfiguration();
        String strFindUserSpecifiedLogClassName = findUserSpecifiedLogClassName();
        if (strFindUserSpecifiedLogClassName != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Attempting to load user-specified log class '");
                stringBuffer.append(strFindUserSpecifiedLogClassName);
                stringBuffer.append("'...");
                logDiagnostic(stringBuffer.toString());
            }
            Log logCreateLogFromClass = createLogFromClass(strFindUserSpecifiedLogClassName, str, true);
            if (logCreateLogFromClass != null) {
                return logCreateLogFromClass;
            }
            StringBuffer stringBuffer2 = new StringBuffer("User-specified log class '");
            stringBuffer2.append(strFindUserSpecifiedLogClassName);
            stringBuffer2.append("' cannot be found or is not useable.");
            informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_LOG4J_LOGGER);
            informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_JDK14_LOGGER);
            informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_LUMBERJACK_LOGGER);
            informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_SIMPLE_LOGGER);
            throw new LogConfigurationException(stringBuffer2.toString());
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
        }
        Log logCreateLogFromClass2 = null;
        int i = 0;
        while (true) {
            String[] strArr = classesToDiscover;
            if (i >= strArr.length || logCreateLogFromClass2 != null) {
                break;
            }
            logCreateLogFromClass2 = createLogFromClass(strArr[i], str, true);
            i++;
        }
        if (logCreateLogFromClass2 != null) {
            return logCreateLogFromClass2;
        }
        throw new LogConfigurationException("No suitable Log implementation");
    }

    public final void informUponSimilarName(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2) && str.regionMatches(true, 0, str2, 0, PKG_LEN + 5)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(str2);
            stringBuffer.append("'?");
        }
    }

    public final String findUserSpecifiedLogClassName() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String systemProperty = (String) getAttribute(LOG_PROPERTY);
        if (systemProperty == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            systemProperty = (String) getAttribute(LOG_PROPERTY_OLD);
        }
        if (systemProperty == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                systemProperty = getSystemProperty(LOG_PROPERTY, null);
            } catch (SecurityException e) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e.getMessage());
                    logDiagnostic(stringBuffer.toString());
                }
            }
        }
        if (systemProperty == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                systemProperty = getSystemProperty(LOG_PROPERTY_OLD, null);
            } catch (SecurityException e2) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e2.getMessage());
                    logDiagnostic(stringBuffer2.toString());
                }
            }
        }
        return systemProperty != null ? systemProperty.trim() : systemProperty;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0162 A[LOOP:0: B:6:0x0034->B:50:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157 A[EDGE_INSN: B:75:0x0157->B:46:0x0157 BREAK  A[LOOP:0: B:6:0x0034->B:50:0x0162], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Log createLogFromClass(String str, String str2, boolean z) throws LogConfigurationException {
        Log log;
        Class<?> cls;
        Class<?> cls2;
        Object objNewInstance;
        URL systemResource;
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Attempting to instantiate '");
            stringBuffer.append(str);
            stringBuffer.append("'");
            logDiagnostic(stringBuffer.toString());
        }
        Object[] objArr = {str2};
        ClassLoader baseClassLoader = getBaseClassLoader();
        Constructor<?> constructor = null;
        Class<?> cls3 = null;
        while (true) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Trying to load '");
            stringBuffer2.append(str);
            stringBuffer2.append("' from classloader ");
            stringBuffer2.append(LogFactory.objectId(baseClassLoader));
            logDiagnostic(stringBuffer2.toString());
            try {
                try {
                    if (isDiagnosticsEnabled()) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append(str.replace('.', '/'));
                        stringBuffer3.append(ClassPath.CLASS_FILE_NAME_EXTENSION);
                        String string = stringBuffer3.toString();
                        if (baseClassLoader != null) {
                            systemResource = baseClassLoader.getResource(string);
                        } else {
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append(string);
                            stringBuffer4.append(ClassPath.CLASS_FILE_NAME_EXTENSION);
                            systemResource = ClassLoader.getSystemResource(stringBuffer4.toString());
                        }
                        if (systemResource == null) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("Class '");
                            stringBuffer5.append(str);
                            stringBuffer5.append("' [");
                            stringBuffer5.append(string);
                            stringBuffer5.append("] cannot be found.");
                            logDiagnostic(stringBuffer5.toString());
                        } else {
                            StringBuffer stringBuffer6 = new StringBuffer();
                            stringBuffer6.append("Class '");
                            stringBuffer6.append(str);
                            stringBuffer6.append("' was found at '");
                            stringBuffer6.append(systemResource);
                            stringBuffer6.append("'");
                            logDiagnostic(stringBuffer6.toString());
                        }
                    }
                    try {
                        cls = Class.forName(str, true, baseClassLoader);
                    } catch (ClassNotFoundException e) {
                        String message = e.getMessage();
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("The log adapter '");
                        stringBuffer7.append(str);
                        stringBuffer7.append("' is not available via classloader ");
                        stringBuffer7.append(LogFactory.objectId(baseClassLoader));
                        stringBuffer7.append(": ");
                        stringBuffer7.append(message.trim());
                        logDiagnostic(stringBuffer7.toString());
                        try {
                            cls = Class.forName(str);
                        } catch (ClassNotFoundException e2) {
                            String message2 = e2.getMessage();
                            StringBuffer stringBuffer8 = new StringBuffer();
                            stringBuffer8.append("The log adapter '");
                            stringBuffer8.append(str);
                            stringBuffer8.append("' is not available via the LogFactoryImpl class classloader: ");
                            stringBuffer8.append(message2.trim());
                            logDiagnostic(stringBuffer8.toString());
                            break;
                        }
                    }
                    cls2 = cls;
                    constructor = cls2.getConstructor(this.logConstructorSignature);
                    objNewInstance = constructor.newInstance(objArr);
                } catch (ExceptionInInitializerError e3) {
                    e = e3;
                } catch (NoClassDefFoundError e4) {
                    e = e4;
                } catch (Throwable th) {
                    th = th;
                }
                if (objNewInstance instanceof Log) {
                    try {
                        log = (Log) objNewInstance;
                        cls3 = cls2;
                        break;
                    } catch (ExceptionInInitializerError e5) {
                        e = e5;
                        cls3 = cls2;
                        String message3 = e.getMessage();
                        StringBuffer stringBuffer9 = new StringBuffer();
                        stringBuffer9.append("The log adapter '");
                        stringBuffer9.append(str);
                        stringBuffer9.append("' is unable to initialize itself when loaded via classloader ");
                        stringBuffer9.append(LogFactory.objectId(baseClassLoader));
                        stringBuffer9.append(": ");
                        stringBuffer9.append(message3.trim());
                        logDiagnostic(stringBuffer9.toString());
                        log = null;
                        if (cls3 != null) {
                            this.logClassName = str;
                            this.logConstructor = constructor;
                            try {
                                this.logMethod = cls3.getMethod("setLogFactory", this.logMethodSignature);
                                StringBuffer stringBuffer10 = new StringBuffer();
                                stringBuffer10.append("Found method setLogFactory(LogFactory) in '");
                                stringBuffer10.append(str);
                                stringBuffer10.append("'");
                                logDiagnostic(stringBuffer10.toString());
                            } catch (Throwable th2) {
                                LogFactory.handleThrowable(th2);
                                this.logMethod = null;
                                StringBuffer stringBuffer11 = new StringBuffer();
                                stringBuffer11.append("[INFO] '");
                                stringBuffer11.append(str);
                                stringBuffer11.append("' from classloader ");
                                stringBuffer11.append(LogFactory.objectId(baseClassLoader));
                                stringBuffer11.append(" does not declare optional method ");
                                stringBuffer11.append("setLogFactory(LogFactory)");
                                logDiagnostic(stringBuffer11.toString());
                            }
                            StringBuffer stringBuffer12 = new StringBuffer();
                            stringBuffer12.append("Log adapter '");
                            stringBuffer12.append(str);
                            stringBuffer12.append("' from classloader ");
                            stringBuffer12.append(LogFactory.objectId(cls3.getClassLoader()));
                            stringBuffer12.append(" has been selected for use.");
                            logDiagnostic(stringBuffer12.toString());
                        }
                        return log;
                    } catch (NoClassDefFoundError e6) {
                        e = e6;
                        cls3 = cls2;
                        String message4 = e.getMessage();
                        StringBuffer stringBuffer13 = new StringBuffer();
                        stringBuffer13.append("The log adapter '");
                        stringBuffer13.append(str);
                        stringBuffer13.append("' is missing dependencies when loaded via classloader ");
                        stringBuffer13.append(LogFactory.objectId(baseClassLoader));
                        stringBuffer13.append(": ");
                        stringBuffer13.append(message4.trim());
                        logDiagnostic(stringBuffer13.toString());
                        log = null;
                        if (cls3 != null) {
                        }
                        return log;
                    } catch (Throwable th3) {
                        th = th3;
                        cls3 = cls2;
                        LogFactory.handleThrowable(th);
                        handleFlawedDiscovery(str, baseClassLoader, th);
                        if (baseClassLoader != null) {
                        }
                    }
                } else {
                    handleFlawedHierarchy(baseClassLoader, cls2);
                    if (baseClassLoader != null) {
                        break;
                    }
                    baseClassLoader = getParentClassLoader(baseClassLoader);
                }
            } catch (LogConfigurationException e7) {
                throw e7;
            }
        }
        log = null;
        if (cls3 != null && z) {
            this.logClassName = str;
            this.logConstructor = constructor;
            this.logMethod = cls3.getMethod("setLogFactory", this.logMethodSignature);
            StringBuffer stringBuffer102 = new StringBuffer();
            stringBuffer102.append("Found method setLogFactory(LogFactory) in '");
            stringBuffer102.append(str);
            stringBuffer102.append("'");
            logDiagnostic(stringBuffer102.toString());
            StringBuffer stringBuffer122 = new StringBuffer();
            stringBuffer122.append("Log adapter '");
            stringBuffer122.append(str);
            stringBuffer122.append("' from classloader ");
            stringBuffer122.append(LogFactory.objectId(cls3.getClassLoader()));
            stringBuffer122.append(" has been selected for use.");
            logDiagnostic(stringBuffer122.toString());
        }
        return log;
    }

    public final ClassLoader getBaseClassLoader() throws LogConfigurationException {
        Class clsClass$ = class$org$apache$commons$logging$impl$LogFactoryImpl;
        if (clsClass$ == null) {
            clsClass$ = class$(LogFactory.FACTORY_DEFAULT);
            class$org$apache$commons$logging$impl$LogFactoryImpl = clsClass$;
        }
        ClassLoader classLoader = getClassLoader(clsClass$);
        if (!this.useTCCL) {
            return classLoader;
        }
        ClassLoader contextClassLoaderInternal = getContextClassLoaderInternal();
        ClassLoader lowestClassLoader = getLowestClassLoader(contextClassLoaderInternal, classLoader);
        if (lowestClassLoader == null) {
            if (this.allowFlawedContext) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
                }
                return contextClassLoaderInternal;
            }
            throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
        }
        if (lowestClassLoader != contextClassLoaderInternal) {
            if (this.allowFlawedContext) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                }
            } else {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
        }
        return lowestClassLoader;
    }

    public final ClassLoader getLowestClassLoader(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 == null) {
            return classLoader;
        }
        ClassLoader parentClassLoader = classLoader;
        while (parentClassLoader != null) {
            if (parentClassLoader == classLoader2) {
                return classLoader;
            }
            parentClassLoader = getParentClassLoader(parentClassLoader);
        }
        ClassLoader parentClassLoader2 = classLoader2;
        while (parentClassLoader2 != null) {
            if (parentClassLoader2 == classLoader) {
                return classLoader2;
            }
            parentClassLoader2 = getParentClassLoader(parentClassLoader2);
        }
        return null;
    }

    public final void handleFlawedDiscovery(String str, ClassLoader classLoader, Throwable th) {
        Throwable targetException;
        Throwable exception;
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not instantiate Log '");
            stringBuffer.append(str);
            stringBuffer.append("' -- ");
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(th.getLocalizedMessage());
            logDiagnostic(stringBuffer.toString());
            if ((th instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) th).getTargetException()) != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("... InvocationTargetException: ");
                stringBuffer2.append(targetException.getClass().getName());
                stringBuffer2.append(": ");
                stringBuffer2.append(targetException.getLocalizedMessage());
                logDiagnostic(stringBuffer2.toString());
                if ((targetException instanceof ExceptionInInitializerError) && (exception = ((ExceptionInInitializerError) targetException).getException()) != null) {
                    StringWriter stringWriter = new StringWriter();
                    exception.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("... ExceptionInInitializerError: ");
                    stringBuffer3.append(stringWriter.toString());
                    logDiagnostic(stringBuffer3.toString());
                }
            }
        }
        if (!this.allowFlawedDiscovery) {
            throw new LogConfigurationException(th);
        }
    }

    public final void handleFlawedHierarchy(ClassLoader classLoader, Class cls) throws LogConfigurationException {
        Class clsClass$ = class$org$apache$commons$logging$Log;
        if (clsClass$ == null) {
            clsClass$ = class$(LOG_PROPERTY);
            class$org$apache$commons$logging$Log = clsClass$;
        }
        String name = clsClass$.getName();
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (name.equals(cls2.getName())) {
                if (isDiagnosticsEnabled()) {
                    try {
                        Class clsClass$2 = class$org$apache$commons$logging$Log;
                        if (clsClass$2 == null) {
                            clsClass$2 = class$(LOG_PROPERTY);
                            class$org$apache$commons$logging$Log = clsClass$2;
                        }
                        ClassLoader classLoader2 = getClassLoader(clsClass$2);
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Class '");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append("' was found in classloader ");
                        stringBuffer.append(LogFactory.objectId(classLoader));
                        stringBuffer.append(". It is bound to a Log interface which is not");
                        stringBuffer.append(" the one loaded from classloader ");
                        stringBuffer.append(LogFactory.objectId(classLoader2));
                        logDiagnostic(stringBuffer.toString());
                    } catch (Throwable th) {
                        LogFactory.handleThrowable(th);
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Error while trying to output diagnostics about bad class '");
                        stringBuffer2.append(cls);
                        stringBuffer2.append("'");
                        logDiagnostic(stringBuffer2.toString());
                    }
                }
                if (!this.allowFlawedHierarchy) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("Terminating logging for this context ");
                    stringBuffer3.append("due to bad log hierarchy. ");
                    stringBuffer3.append("You have more than one version of '");
                    Class clsClass$3 = class$org$apache$commons$logging$Log;
                    if (clsClass$3 == null) {
                        clsClass$3 = class$(LOG_PROPERTY);
                        class$org$apache$commons$logging$Log = clsClass$3;
                    }
                    stringBuffer3.append(clsClass$3.getName());
                    stringBuffer3.append("' visible.");
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(stringBuffer3.toString());
                    }
                    throw new LogConfigurationException(stringBuffer3.toString());
                }
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("Warning: bad log hierarchy. ");
                    stringBuffer4.append("You have more than one version of '");
                    Class clsClass$4 = class$org$apache$commons$logging$Log;
                    if (clsClass$4 == null) {
                        clsClass$4 = class$(LOG_PROPERTY);
                        class$org$apache$commons$logging$Log = clsClass$4;
                    }
                    stringBuffer4.append(clsClass$4.getName());
                    stringBuffer4.append("' visible.");
                    logDiagnostic(stringBuffer4.toString());
                    return;
                }
                return;
            }
        }
        if (!this.allowFlawedDiscovery) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("Terminating logging for this context. ");
            stringBuffer5.append("Log class '");
            stringBuffer5.append(cls.getName());
            stringBuffer5.append("' does not implement the Log interface.");
            if (isDiagnosticsEnabled()) {
                logDiagnostic(stringBuffer5.toString());
            }
            throw new LogConfigurationException(stringBuffer5.toString());
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[WARNING] Log class '");
            stringBuffer6.append(cls.getName());
            stringBuffer6.append("' does not implement the Log interface.");
            logDiagnostic(stringBuffer6.toString());
        }
    }
}
