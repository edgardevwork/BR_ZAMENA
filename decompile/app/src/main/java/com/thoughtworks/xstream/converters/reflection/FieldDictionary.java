package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.core.Caching;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.util.OrderRetainingMap;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes8.dex */
public class FieldDictionary implements Caching {
    public static final DictionaryEntry OBJECT_DICTIONARY_ENTRY;
    public static /* synthetic */ Class class$java$lang$Object;
    public transient Map dictionaryEntries;
    public transient FieldUtil fieldUtil;
    public final FieldKeySorter sorter;

    /* loaded from: classes5.dex */
    public interface FieldUtil {
        boolean isSynthetic(Field field);
    }

    static {
        Map map = Collections.EMPTY_MAP;
        OBJECT_DICTIONARY_ENTRY = new DictionaryEntry(map, map);
    }

    public FieldDictionary() {
        this(new ImmutableFieldKeySorter());
    }

    public FieldDictionary(FieldKeySorter fieldKeySorter) {
        this.sorter = fieldKeySorter;
        init();
    }

    public final void init() {
        this.dictionaryEntries = new HashMap();
        if (JVM.is15()) {
            try {
                this.fieldUtil = (FieldUtil) JVM.loadClassForName("com.thoughtworks.xstream.converters.reflection.FieldUtil15", true).newInstance();
            } catch (Exception unused) {
            }
        }
        if (this.fieldUtil == null) {
            this.fieldUtil = new FieldUtil14();
        }
    }

    public Iterator serializableFieldsFor(Class cls) {
        return fieldsFor(cls);
    }

    public Iterator fieldsFor(Class cls) {
        return buildMap(cls, true).values().iterator();
    }

    public Field field(Class cls, String str, Class cls2) throws Throwable {
        Field fieldFieldOrNull = fieldOrNull(cls, str, cls2);
        if (fieldFieldOrNull != null) {
            return fieldFieldOrNull;
        }
        throw new MissingFieldException(cls.getName(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.thoughtworks.xstream.converters.reflection.FieldKey] */
    public Field fieldOrNull(Class cls, String str, Class cls2) throws Throwable {
        Map mapBuildMap = buildMap(cls, cls2 != null);
        if (cls2 != null) {
            str = new FieldKey(str, cls2, -1);
        }
        return (Field) mapBuildMap.get(str);
    }

    public final Map buildMap(Class cls, boolean z) throws Throwable {
        LinkedList linkedList = new LinkedList();
        DictionaryEntry dictionaryEntryBuildDictionaryEntryForClass = null;
        while (dictionaryEntryBuildDictionaryEntryForClass == null) {
            Class clsClass$ = class$java$lang$Object;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Object");
                class$java$lang$Object = clsClass$;
            }
            if (clsClass$.equals(cls) || cls == null) {
                dictionaryEntryBuildDictionaryEntryForClass = OBJECT_DICTIONARY_ENTRY;
            } else {
                dictionaryEntryBuildDictionaryEntryForClass = getDictionaryEntry(cls);
            }
            if (dictionaryEntryBuildDictionaryEntryForClass == null) {
                linkedList.addFirst(cls);
                cls = cls.getSuperclass();
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            dictionaryEntryBuildDictionaryEntryForClass = buildDictionaryEntryForClass(cls2, dictionaryEntryBuildDictionaryEntryForClass);
            synchronized (this) {
                try {
                    DictionaryEntry dictionaryEntry = getDictionaryEntry(cls2);
                    if (dictionaryEntry == null) {
                        this.dictionaryEntries.put(cls2, dictionaryEntryBuildDictionaryEntryForClass);
                    } else {
                        dictionaryEntryBuildDictionaryEntryForClass = dictionaryEntry;
                    }
                } finally {
                }
            }
        }
        return z ? dictionaryEntryBuildDictionaryEntryForClass.getKeyedByFieldKey() : dictionaryEntryBuildDictionaryEntryForClass.getKeyedByFieldName();
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public final DictionaryEntry buildDictionaryEntryForClass(Class cls, DictionaryEntry dictionaryEntry) throws SecurityException {
        HashMap map = new HashMap(dictionaryEntry.getKeyedByFieldName());
        OrderRetainingMap orderRetainingMap = new OrderRetainingMap(dictionaryEntry.getKeyedByFieldKey());
        Field[] declaredFields = cls.getDeclaredFields();
        if (JVM.reverseFieldDefinition()) {
            int length = declaredFields.length >> 1;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                int length2 = (declaredFields.length - i) - 1;
                Field field = declaredFields[i];
                declaredFields[i] = declaredFields[length2];
                declaredFields[length2] = field;
                length = i;
            }
        }
        for (int i2 = 0; i2 < declaredFields.length; i2++) {
            Field field2 = declaredFields[i2];
            if (!this.fieldUtil.isSynthetic(field2) || !field2.getName().startsWith("$jacoco")) {
                if (!field2.isAccessible()) {
                    field2.setAccessible(true);
                }
                FieldKey fieldKey = new FieldKey(field2.getName(), field2.getDeclaringClass(), i2);
                Field field3 = (Field) map.get(field2.getName());
                if (field3 == null || (field3.getModifiers() & 8) != 0 || (field2.getModifiers() & 8) == 0) {
                    map.put(field2.getName(), field2);
                }
                orderRetainingMap.put(fieldKey, field2);
            }
        }
        return new DictionaryEntry(map, this.sorter.sort(cls, orderRetainingMap));
    }

    public final synchronized DictionaryEntry getDictionaryEntry(Class cls) {
        return (DictionaryEntry) this.dictionaryEntries.get(cls);
    }

    @Override // com.thoughtworks.xstream.core.Caching
    public synchronized void flushCache() {
        this.dictionaryEntries.clear();
        FieldKeySorter fieldKeySorter = this.sorter;
        if (fieldKeySorter instanceof Caching) {
            ((Caching) fieldKeySorter).flushCache();
        }
    }

    public Object readResolve() {
        init();
        return this;
    }

    /* loaded from: classes5.dex */
    public static final class DictionaryEntry {
        public final Map keyedByFieldKey;
        public final Map keyedByFieldName;

        public DictionaryEntry(Map map, Map map2) {
            this.keyedByFieldName = map;
            this.keyedByFieldKey = map2;
        }

        public Map getKeyedByFieldName() {
            return this.keyedByFieldName;
        }

        public Map getKeyedByFieldKey() {
            return this.keyedByFieldKey;
        }
    }
}
