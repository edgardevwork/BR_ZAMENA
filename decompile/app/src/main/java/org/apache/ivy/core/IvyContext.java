package org.apache.ivy.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.circular.CircularDependencyStrategy;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.MessageLogger;

/* loaded from: classes7.dex */
public class IvyContext {
    public static ThreadLocal<Stack<IvyContext>> current = new ThreadLocal<>();
    public Map<String, Object> contextMap;

    /* renamed from: dd */
    public DependencyDescriptor f9954dd;
    public Ivy defaultIvy;
    public WeakReference<Ivy> ivy;
    public Thread operatingThread;
    public ResolveData resolveData;

    public IvyContext() {
        this.ivy = new WeakReference<>(null);
        this.contextMap = new HashMap();
    }

    public IvyContext(IvyContext ivyContext) {
        this.ivy = new WeakReference<>(null);
        this.contextMap = new HashMap();
        this.defaultIvy = ivyContext.defaultIvy;
        this.ivy = ivyContext.ivy;
        this.contextMap = new HashMap(ivyContext.contextMap);
        this.operatingThread = ivyContext.operatingThread;
        this.resolveData = ivyContext.resolveData;
        this.f9954dd = ivyContext.f9954dd;
    }

    public static IvyContext getContext() {
        Stack<IvyContext> currentStack = getCurrentStack();
        if (currentStack.isEmpty()) {
            currentStack.push(new IvyContext());
        }
        return currentStack.peek();
    }

    public static Stack<IvyContext> getCurrentStack() {
        Stack<IvyContext> stack = current.get();
        if (stack != null) {
            return stack;
        }
        Stack<IvyContext> stack2 = new Stack<>();
        current.set(stack2);
        return stack2;
    }

    public static IvyContext pushNewContext() {
        return pushContext(new IvyContext());
    }

    public static IvyContext pushNewCopyContext() {
        return pushContext(new IvyContext(getContext()));
    }

    public static IvyContext pushContext(IvyContext ivyContext) {
        getCurrentStack().push(ivyContext);
        return ivyContext;
    }

    public static IvyContext popContext() {
        return getCurrentStack().pop();
    }

    public static Object peekInContextStack(String str) {
        Stack<IvyContext> currentStack = getCurrentStack();
        Object objPeek = null;
        for (int size = currentStack.size() - 1; size >= 0 && objPeek == null; size--) {
            objPeek = currentStack.get(size).peek(str);
        }
        return objPeek;
    }

    public Ivy getIvy() {
        Ivy ivyPeekIvy = peekIvy();
        return ivyPeekIvy == null ? getDefaultIvy() : ivyPeekIvy;
    }

    public Ivy peekIvy() {
        return this.ivy.get();
    }

    public final Ivy getDefaultIvy() {
        if (this.defaultIvy == null) {
            Ivy ivyNewInstance = Ivy.newInstance();
            this.defaultIvy = ivyNewInstance;
            try {
                ivyNewInstance.configureDefault();
            } catch (Exception e) {
                Message.debug(e);
            }
        }
        return this.defaultIvy;
    }

    public void setIvy(Ivy ivy) {
        this.ivy = new WeakReference<>(ivy);
        this.operatingThread = Thread.currentThread();
    }

    public IvySettings getSettings() {
        return getIvy().getSettings();
    }

    public CircularDependencyStrategy getCircularDependencyStrategy() {
        return getSettings().getCircularDependencyStrategy();
    }

    public <T> T get(String str) {
        WeakReference weakReference = (WeakReference) this.contextMap.get(str);
        if (weakReference == null) {
            return null;
        }
        return (T) weakReference.get();
    }

    public <T> void set(String str, T t) {
        this.contextMap.put(str, new WeakReference(t));
    }

    public Object peek(String str) {
        synchronized (this.contextMap) {
            try {
                Object obj = this.contextMap.get(str);
                if (obj == null) {
                    return null;
                }
                if (obj instanceof List) {
                    if (((List) obj).size() == 0) {
                        return null;
                    }
                    return ((List) obj).get(0);
                }
                throw new RuntimeException("Cannot top from non List object " + obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object pop(String str) {
        synchronized (this.contextMap) {
            try {
                Object obj = this.contextMap.get(str);
                if (obj == null) {
                    return null;
                }
                if (obj instanceof List) {
                    if (((List) obj).size() == 0) {
                        return null;
                    }
                    return ((List) obj).remove(0);
                }
                throw new RuntimeException("Cannot pop from non List object " + obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean pop(String str, Object obj) {
        synchronized (this.contextMap) {
            try {
                Object obj2 = this.contextMap.get(str);
                if (obj2 == null) {
                    return false;
                }
                if (obj2 instanceof List) {
                    if (((List) obj2).size() == 0) {
                        return false;
                    }
                    if (!((List) obj2).get(0).equals(obj)) {
                        return false;
                    }
                    ((List) obj2).remove(0);
                    return true;
                }
                throw new RuntimeException("Cannot pop from non List object " + obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void push(String str, Object obj) {
        synchronized (this.contextMap) {
            try {
                if (!this.contextMap.containsKey(str)) {
                    this.contextMap.put(str, new LinkedList());
                }
                Object obj2 = this.contextMap.get(str);
                if (obj2 instanceof List) {
                    ((List) obj2).add(0, obj);
                } else {
                    throw new RuntimeException("Cannot push to non List object " + obj2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Thread getOperatingThread() {
        return this.operatingThread;
    }

    public MessageLogger getMessageLogger() {
        Ivy ivyPeekIvy = peekIvy();
        if (ivyPeekIvy == null) {
            Ivy ivy = this.defaultIvy;
            if (ivy == null) {
                return Message.getDefaultLogger();
            }
            return ivy.getLoggerEngine();
        }
        return ivyPeekIvy.getLoggerEngine();
    }

    public EventManager getEventManager() {
        return getIvy().getEventManager();
    }

    public void checkInterrupted() {
        getIvy().checkInterrupted();
    }

    public void setResolveData(ResolveData resolveData) {
        this.resolveData = resolveData;
    }

    public ResolveData getResolveData() {
        return this.resolveData;
    }

    public void setDependencyDescriptor(DependencyDescriptor dependencyDescriptor) {
        this.f9954dd = dependencyDescriptor;
    }

    public DependencyDescriptor getDependencyDescriptor() {
        return this.f9954dd;
    }
}
