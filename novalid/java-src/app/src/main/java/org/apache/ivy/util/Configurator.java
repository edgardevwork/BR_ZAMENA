package org.apache.ivy.util;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.ivy.core.IvyPatternHelper;

/* loaded from: classes8.dex */
public class Configurator {
    public static final List<String> TRUE_VALUES = Arrays.asList("true", BooleanUtils.YES, "on");
    public FileResolver fileResolver = FileResolver.DEFAULT;
    public Map<String, Class<?>> typedefs = new HashMap();
    public Map<String, MacroDef> macrodefs = new HashMap();
    public Stack<ObjectDescriptor> objectStack = new Stack<>();

    public static class Macro {
        public Map<String, String> attValues = new HashMap();
        public Map<String, List<MacroRecord>> macroRecords = new HashMap();
        public MacroDef macrodef;

        public Macro(MacroDef macroDef) {
            this.macrodef = macroDef;
        }

        public void defineAttribute(String str, String str2) {
            if (this.macrodef.getAttribute(str) == null) {
                throw new IllegalArgumentException("undeclared attribute " + str + " on macro " + this.macrodef.getName());
            }
            this.attValues.put(str, str2);
        }

        public MacroRecord recordCreateChild(String str) {
            MacroRecord macroRecord = new MacroRecord(str);
            List<MacroRecord> arrayList = this.macroRecords.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.macroRecords.put(str, arrayList);
            }
            arrayList.add(macroRecord);
            return macroRecord;
        }

        public Object play(Configurator configurator) {
            return this.macrodef.play(configurator, this.attValues, this.macroRecords);
        }
    }

    public static class Attribute {
        public String defaultValue;
        public String name;

        public String getDefault() {
            return this.defaultValue;
        }

        public void setDefault(String str) {
            this.defaultValue = str;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public static class Element {
        public String name;
        public boolean optional = false;

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public boolean isOptional() {
            return this.optional;
        }

        public void setOptional(boolean z) {
            this.optional = z;
        }
    }

    public static class MacroRecord {
        public Map<String, String> attributes = new LinkedHashMap();
        public List<MacroRecord> children = new ArrayList();
        public String name;
        public Object object;

        public MacroRecord(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        public void recordAttribute(String str, String str2) {
            this.attributes.put(str, str2);
        }

        public MacroRecord recordChild(String str) {
            MacroRecord macroRecord = new MacroRecord(str);
            this.children.add(macroRecord);
            return macroRecord;
        }

        public MacroRecord recordChild(String str, Object obj) {
            MacroRecord macroRecordRecordChild = recordChild(str);
            macroRecordRecordChild.object = obj;
            return macroRecordRecordChild;
        }

        public Map<String, String> getAttributes() {
            return this.attributes;
        }

        public List<MacroRecord> getChildren() {
            return this.children;
        }

        public Object getObject() {
            return this.object;
        }
    }

    public static class MacroDef {
        public Map<String, Attribute> attributes = new HashMap();
        public Map<String, Element> elements = new HashMap();
        public MacroRecord macroRecord;
        public String name;

        public MacroDef(String str) {
            this.name = str;
        }

        public Attribute getAttribute(String str) {
            return this.attributes.get(str);
        }

        public Object play(Configurator configurator, Map<String, String> map, Map<String, List<MacroRecord>> map2) {
            for (Attribute attribute : this.attributes.values()) {
                if (map.get(attribute.getName()) == null) {
                    if (attribute.getDefault() == null) {
                        throw new IllegalArgumentException("attribute " + attribute.getName() + " is required in " + getName());
                    }
                    map.put(attribute.getName(), attribute.getDefault());
                }
            }
            return play(configurator, this.macroRecord, map, map2);
        }

        public final Object play(Configurator configurator, MacroRecord macroRecord, Map<String, String> map, Map<String, List<MacroRecord>> map2) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            if (macroRecord.getObject() != null) {
                configurator.addChild(macroRecord.getName(), macroRecord.getObject());
                configurator.endCreateChild();
                return macroRecord.getObject();
            }
            configurator.startCreateChild(macroRecord.getName());
            for (Map.Entry<String, String> entry : macroRecord.getAttributes().entrySet()) {
                configurator.setAttribute(entry.getKey(), replaceParam(entry.getValue(), map));
            }
            for (MacroRecord macroRecord2 : macroRecord.getChildren()) {
                Element element = this.elements.get(macroRecord2.getName());
                if (element != null) {
                    List<MacroRecord> list = map2.get(macroRecord2.getName());
                    if (list != null) {
                        Iterator<MacroRecord> it = list.iterator();
                        while (it.hasNext()) {
                            Iterator<MacroRecord> it2 = it.next().getChildren().iterator();
                            while (it2.hasNext()) {
                                play(configurator, it2.next(), map, Collections.emptyMap());
                            }
                        }
                    } else if (!element.isOptional()) {
                        throw new IllegalArgumentException("non optional element is not specified: " + element.getName() + " in macro " + getName());
                    }
                } else {
                    play(configurator, macroRecord2, map, map2);
                }
            }
            return configurator.endCreateChild();
        }

        public final String replaceParam(String str, Map<String, String> map) {
            return IvyPatternHelper.substituteParams(str, map);
        }

        public String getName() {
            return this.name;
        }

        public void addConfiguredAttribute(Attribute attribute) {
            this.attributes.put(attribute.getName(), attribute);
        }

        public void addConfiguredElement(Element element) {
            this.elements.put(element.getName(), element);
        }

        public Macro createMacro() {
            return new Macro(this);
        }

        public void addAttribute(String str, String str2) {
            Attribute attribute = new Attribute();
            attribute.setName(str);
            attribute.setDefault(str2);
            addConfiguredAttribute(attribute);
        }

        public void addElement(String str, boolean z) {
            Element element = new Element();
            element.setName(str);
            element.setOptional(z);
            addConfiguredElement(element);
        }

        public MacroRecord recordCreateChild(String str) {
            MacroRecord macroRecord = new MacroRecord(str);
            this.macroRecord = macroRecord;
            return macroRecord;
        }
    }

    public static class ObjectDescriptor {
        public Object obj;
        public String objName;
        public Map<String, Method> createMethods = new HashMap();
        public Map<String, Method> addMethods = new HashMap();
        public Map<String, Method> addConfiguredMethods = new HashMap();
        public Map<String, Method> setMethods = new HashMap();
        public Map<Class<?>, Method> typeAddMethods = new HashMap();
        public Map<Class<?>, Method> typeAddConfiguredMethods = new HashMap();

        public ObjectDescriptor(Object obj, String str) throws SecurityException {
            this.obj = obj;
            this.objName = str;
            for (Method method : obj.getClass().getMethods()) {
                if (method.getName().startsWith("create") && method.getParameterTypes().length == 0 && !Void.TYPE.equals(method.getReturnType())) {
                    String strUncapitalize = StringUtils.uncapitalize(method.getName().substring(6));
                    if (strUncapitalize.length() != 0) {
                        addCreateMethod(strUncapitalize, method);
                    }
                } else if (method.getName().startsWith("addConfigured") && method.getParameterTypes().length == 1 && Void.TYPE.equals(method.getReturnType())) {
                    String strUncapitalize2 = StringUtils.uncapitalize(method.getName().substring(13));
                    if (strUncapitalize2.length() == 0) {
                        addAddConfiguredMethod(method);
                    }
                    addAddConfiguredMethod(strUncapitalize2, method);
                } else if (method.getName().startsWith("add") && !method.getName().startsWith("addConfigured") && method.getParameterTypes().length == 1 && Void.TYPE.equals(method.getReturnType())) {
                    String strUncapitalize3 = StringUtils.uncapitalize(method.getName().substring(3));
                    if (strUncapitalize3.length() == 0) {
                        addAddMethod(method);
                    }
                    addAddMethod(strUncapitalize3, method);
                } else if (method.getName().startsWith("set") && method.getParameterTypes().length == 1 && Void.TYPE.equals(method.getReturnType())) {
                    String strUncapitalize4 = StringUtils.uncapitalize(method.getName().substring(3));
                    if (strUncapitalize4.length() != 0) {
                        addSetMethod(strUncapitalize4, method);
                    }
                }
            }
        }

        public void addCreateMethod(String str, Method method) {
            this.createMethods.put(str, method);
        }

        public void addAddMethod(String str, Method method) {
            this.addMethods.put(str, method);
        }

        public void addAddConfiguredMethod(String str, Method method) {
            this.addConfiguredMethods.put(str, method);
        }

        public final void addAddMethod(Method method) {
            this.typeAddMethods.put(method.getParameterTypes()[0], method);
        }

        public final void addAddConfiguredMethod(Method method) {
            this.typeAddConfiguredMethods.put(method.getParameterTypes()[0], method);
        }

        public void addSetMethod(String str, Method method) {
            Method method2 = this.setMethods.get(str);
            if (method2 == null || method2.getParameterTypes()[0] != String.class) {
                this.setMethods.put(str, method);
            }
        }

        public Object getObject() {
            return this.obj;
        }

        public Method getCreateMethod(String str) {
            return this.createMethods.get(str);
        }

        public Method getAddMethod(String str) {
            return this.addMethods.get(str);
        }

        public Method getAddConfiguredMethod(String str) {
            return this.addConfiguredMethods.get(str);
        }

        public Method getAddMethod(Class<?> cls) {
            return getTypeMatchingMethod(cls, this.typeAddMethods);
        }

        public Method getAddConfiguredMethod(Class<?> cls) {
            return getTypeMatchingMethod(cls, this.typeAddConfiguredMethods);
        }

        public final Method getTypeMatchingMethod(Class<?> cls, Map<Class<?>, Method> map) {
            Method method = map.get(cls);
            if (method != null) {
                return method;
            }
            for (Map.Entry<Class<?>, Method> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    return entry.getValue();
                }
            }
            return null;
        }

        public Method getSetMethod(String str) {
            return this.setMethods.get(str);
        }

        public String getObjectName() {
            return this.objName;
        }
    }

    public void typeDef(String str, String str2) throws ClassNotFoundException {
        typeDef(str, Class.forName(str2));
    }

    public void typeDef(String str, Class<?> cls) {
        this.typedefs.put(str, cls);
    }

    public void setRoot(Object obj) {
        obj.getClass();
        this.objectStack.clear();
        setCurrent(obj, null);
    }

    public void clear() {
        this.objectStack.clear();
    }

    public final void setCurrent(Object obj, String str) {
        this.objectStack.push(new ObjectDescriptor(obj, str));
    }

    public Object startCreateChild(String str) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        if (this.objectStack.isEmpty()) {
            throw new IllegalStateException("set root before creating child");
        }
        ObjectDescriptor objectDescriptorPeek = this.objectStack.peek();
        Object object = objectDescriptorPeek.getObject();
        if ((object instanceof MacroDef) && !"attribute".equals(str) && !"element".equals(str)) {
            MacroRecord macroRecordRecordCreateChild = ((MacroDef) object).recordCreateChild(str);
            setCurrent(macroRecordRecordCreateChild, str);
            return macroRecordRecordCreateChild;
        }
        if (object instanceof Macro) {
            MacroRecord macroRecordRecordCreateChild2 = ((Macro) object).recordCreateChild(str);
            setCurrent(macroRecordRecordCreateChild2, str);
            return macroRecordRecordCreateChild2;
        }
        if (object instanceof MacroRecord) {
            MacroRecord macroRecordRecordChild = ((MacroRecord) object).recordChild(str);
            setCurrent(macroRecordRecordChild, str);
            return macroRecordRecordChild;
        }
        MacroDef macroDef = this.macrodefs.get(str);
        if (macroDef != null) {
            Macro macroCreateMacro = macroDef.createMacro();
            setCurrent(macroCreateMacro, str);
            return macroCreateMacro;
        }
        Class<?> cls = this.typedefs.get(str);
        try {
            if (cls != null) {
                return addChild(objectDescriptorPeek, cls, str, null);
            }
            Method createMethod = objectDescriptorPeek.getCreateMethod(str);
            if (createMethod != null) {
                Object objInvoke = createMethod.invoke(object, null);
                setCurrent(objInvoke, str);
                return objInvoke;
            }
            Method addMethod = objectDescriptorPeek.getAddMethod(str);
            if (addMethod != null) {
                Object objNewInstance2 = addMethod.getParameterTypes()[0].newInstance();
                addMethod.invoke(object, objNewInstance2);
                setCurrent(objNewInstance2, str);
                return objNewInstance2;
            }
            Method addConfiguredMethod = objectDescriptorPeek.getAddConfiguredMethod(str);
            if (addConfiguredMethod == null) {
                throw new IllegalArgumentException("no appropriate method found for adding " + str + " on " + object.getClass());
            }
            Class<?> cls2 = addConfiguredMethod.getParameterTypes()[0];
            if (Map.class == cls2) {
                objNewInstance = new HashMap();
            } else {
                objNewInstance = cls2.newInstance();
            }
            setCurrent(objNewInstance, str);
            return objNewInstance;
        } catch (InstantiationException unused) {
            throw new IllegalArgumentException("no default constructor on " + cls + " for adding " + str + " on " + object.getClass());
        } catch (Exception e) {
            throw new IllegalArgumentException("bad method found for " + str + " on " + object.getClass(), e);
        }
    }

    public void addChild(String str, Object obj) {
        if (this.objectStack.isEmpty()) {
            throw new IllegalStateException("set root before creating child");
        }
        ObjectDescriptor objectDescriptorPeek = this.objectStack.peek();
        try {
            addChild(objectDescriptorPeek, obj.getClass(), str, obj);
        } catch (InstantiationException unused) {
            throw new IllegalArgumentException("no default constructor on " + obj.getClass() + " for adding " + str + " on " + objectDescriptorPeek.getObject().getClass());
        } catch (Exception e) {
            throw new IllegalArgumentException("bad method found for " + str + " on " + objectDescriptorPeek.getObject().getClass(), e);
        }
    }

    public final Object addChild(ObjectDescriptor objectDescriptor, Class<?> cls, String str, Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object object = objectDescriptor.getObject();
        if (object instanceof MacroRecord) {
            MacroRecord macroRecordRecordChild = ((MacroRecord) object).recordChild(str, obj);
            setCurrent(macroRecordRecordChild, str);
            return macroRecordRecordChild;
        }
        Method addMethod = objectDescriptor.getAddMethod(cls);
        if (addMethod != null) {
            if (obj == null) {
                obj = cls.newInstance();
            }
            addMethod.invoke(object, obj);
            setCurrent(obj, str);
            return obj;
        }
        if (objectDescriptor.getAddConfiguredMethod(cls) != null) {
            if (obj == null) {
                if (Map.class == cls) {
                    obj = new HashMap();
                } else {
                    obj = cls.newInstance();
                }
            }
            setCurrent(obj, str);
            return obj;
        }
        throw new IllegalArgumentException("no appropriate method found for adding " + str + " on " + object.getClass());
    }

    public boolean isTopLevelMacroRecord() {
        if (this.objectStack.isEmpty()) {
            return false;
        }
        return this.objectStack.peek().getObject() instanceof MacroDef;
    }

    public void setAttribute(String str, String str2) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Object objValueOf;
        if (this.objectStack.isEmpty()) {
            throw new IllegalStateException("set root before setting attribute");
        }
        ObjectDescriptor objectDescriptorPeek = this.objectStack.peek();
        if (objectDescriptorPeek.getObject() instanceof Macro) {
            ((Macro) objectDescriptorPeek.getObject()).defineAttribute(str, str2);
            return;
        }
        if (objectDescriptorPeek.getObject() instanceof MacroRecord) {
            ((MacroRecord) objectDescriptorPeek.getObject()).recordAttribute(str, str2);
            return;
        }
        Method setMethod = objectDescriptorPeek.getSetMethod(str);
        if (setMethod == null) {
            if (!(objectDescriptorPeek.getObject() instanceof Map)) {
                throw new IllegalArgumentException("no set method found for " + str + " on " + objectDescriptorPeek.getObject().getClass());
            }
            ((Map) objectDescriptorPeek.getObject()).put(str, str2);
            return;
        }
        Class<?> cls = setMethod.getParameterTypes()[0];
        try {
            if (cls.equals(String.class)) {
                objValueOf = str2;
            } else if (cls.equals(Boolean.class) || cls.equals(Boolean.TYPE)) {
                objValueOf = Boolean.valueOf(TRUE_VALUES.contains(str2));
            } else if (cls.equals(Character.class) || cls.equals(Character.TYPE)) {
                objValueOf = Character.valueOf(str2.length() > 0 ? str2.charAt(0) : ' ');
            } else if (cls.equals(Short.class) || cls.equals(Short.TYPE)) {
                objValueOf = Short.valueOf(str2);
            } else if (cls.equals(Integer.class) || cls.equals(Integer.TYPE)) {
                objValueOf = Integer.valueOf(str2);
            } else if (cls.equals(Long.class) || cls.equals(Long.TYPE)) {
                objValueOf = Long.valueOf(str2);
            } else if (cls.equals(Class.class)) {
                objValueOf = Class.forName(str2);
            } else if (cls.equals(File.class)) {
                objValueOf = this.fileResolver.resolveFile(str2, objectDescriptorPeek.getObjectName() + "." + str);
            } else {
                objValueOf = cls.getConstructor(String.class).newInstance(str2);
            }
            try {
                setMethod.invoke(objectDescriptorPeek.getObject(), objValueOf);
            } catch (Exception e) {
                throw new IllegalArgumentException("impossible to set " + str + " to " + objValueOf + " on " + objectDescriptorPeek.getObject().getClass(), e);
            }
        } catch (Exception e2) {
            throw new IllegalArgumentException("impossible to convert " + str2 + " to " + cls + " for setting " + str + " on " + objectDescriptorPeek.getObject().getClass() + ": " + e2.getMessage(), e2);
        }
    }

    public void addText(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.objectStack.isEmpty()) {
            throw new IllegalStateException("set root before adding text");
        }
        ObjectDescriptor objectDescriptorPeek = this.objectStack.peek();
        try {
            objectDescriptorPeek.getObject().getClass().getMethod("addText", String.class).invoke(objectDescriptorPeek.getObject(), str);
        } catch (Exception e) {
            throw new IllegalArgumentException("impossible to add text on " + objectDescriptorPeek.getObject().getClass(), e);
        }
    }

    public Object endCreateChild() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method addConfiguredMethod;
        if (this.objectStack.isEmpty()) {
            throw new IllegalStateException("set root before ending child");
        }
        ObjectDescriptor objectDescriptorPop = this.objectStack.pop();
        if (this.objectStack.isEmpty()) {
            this.objectStack.push(objectDescriptorPop);
            throw new IllegalStateException("cannot end root");
        }
        if (objectDescriptorPop.getObject() instanceof Macro) {
            return ((Macro) objectDescriptorPop.getObject()).play(this);
        }
        ObjectDescriptor objectDescriptorPeek = this.objectStack.peek();
        String objectName = objectDescriptorPop.getObjectName();
        Class<?> cls = this.typedefs.get(objectName);
        if (cls == null) {
            addConfiguredMethod = objectDescriptorPeek.getAddConfiguredMethod(objectName);
        } else {
            addConfiguredMethod = objectDescriptorPeek.getAddConfiguredMethod(cls);
        }
        if (addConfiguredMethod != null) {
            try {
                addConfiguredMethod.invoke(objectDescriptorPeek.getObject(), objectDescriptorPop.getObject());
            } catch (Exception e) {
                throw new IllegalArgumentException("impossible to add configured child for " + objectName + " on " + objectDescriptorPeek.getObject().getClass() + ": " + StringUtils.getErrorMessage(e), e);
            }
        }
        return objectDescriptorPop.getObject();
    }

    public Object getCurrent() {
        if (this.objectStack.isEmpty()) {
            return null;
        }
        return this.objectStack.peek().getObject();
    }

    public int getDepth() {
        return this.objectStack.size();
    }

    public MacroDef startMacroDef(String str) {
        MacroDef macroDef = new MacroDef(str);
        setCurrent(macroDef, str);
        return macroDef;
    }

    public void addMacroAttribute(String str, String str2) {
        ((MacroDef) getCurrent()).addAttribute(str, str2);
    }

    public void addMacroElement(String str, boolean z) {
        ((MacroDef) getCurrent()).addElement(str, z);
    }

    public void endMacroDef() {
        addConfiguredMacrodef((MacroDef) getCurrent());
        this.objectStack.pop();
    }

    public void addConfiguredMacrodef(MacroDef macroDef) {
        this.macrodefs.put(macroDef.getName(), macroDef);
    }

    public Class<?> getTypeDef(String str) {
        return this.typedefs.get(str);
    }

    public FileResolver getFileResolver() {
        return this.fileResolver;
    }

    public void setFileResolver(FileResolver fileResolver) {
        Checks.checkNotNull(fileResolver, "fileResolver");
        this.fileResolver = fileResolver;
    }
}
