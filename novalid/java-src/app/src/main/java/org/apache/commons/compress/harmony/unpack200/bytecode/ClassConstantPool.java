package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import org.apache.commons.compress.harmony.unpack200.Segment;

/* loaded from: classes7.dex */
public class ClassConstantPool {
    public Map<ClassFileEntry, Integer> indexCache;
    public boolean resolved;
    public HashSet<ClassFileEntry> entriesContainsSet = new HashSet<>();
    public HashSet<ClassFileEntry> othersContainsSet = new HashSet<>();
    public final HashSet<ClassFileEntry> mustStartClassPool = new HashSet<>();
    public final List<ClassFileEntry> others = new ArrayList(500);
    public final List<ClassFileEntry> entries = new ArrayList(500);

    public ClassFileEntry add(ClassFileEntry classFileEntry) {
        if (classFileEntry instanceof ByteCode) {
            return null;
        }
        if (classFileEntry instanceof ConstantPoolEntry) {
            if (this.entriesContainsSet.add(classFileEntry)) {
                this.entries.add(classFileEntry);
            }
        } else if (this.othersContainsSet.add(classFileEntry)) {
            this.others.add(classFileEntry);
        }
        return classFileEntry;
    }

    public void addNestedEntries() {
        ArrayList arrayList = new ArrayList(512);
        ArrayList arrayList2 = new ArrayList(512);
        arrayList.addAll(this.entries);
        arrayList.addAll(this.others);
        boolean z = true;
        while (true) {
            if (!z && arrayList.size() <= 0) {
                return;
            }
            arrayList2.clear();
            int size = this.entries.size();
            int size2 = this.others.size();
            for (int i = 0; i < arrayList.size(); i++) {
                ClassFileEntry classFileEntry = (ClassFileEntry) arrayList.get(i);
                ClassFileEntry[] nestedClassFileEntries = classFileEntry.getNestedClassFileEntries();
                arrayList2.addAll(Arrays.asList(nestedClassFileEntries));
                if ((classFileEntry instanceof ByteCode) && ((ByteCode) classFileEntry).nestedMustStartClassPool()) {
                    this.mustStartClassPool.addAll(Arrays.asList(nestedClassFileEntries));
                }
                add(classFileEntry);
            }
            z = (this.entries.size() == size && this.others.size() == size2) ? false : true;
            arrayList.clear();
            arrayList.addAll(arrayList2);
        }
    }

    public int indexOf(ClassFileEntry classFileEntry) {
        if (!this.resolved) {
            throw new IllegalStateException("Constant pool is not yet resolved; this does not make any sense");
        }
        Map<ClassFileEntry, Integer> map = this.indexCache;
        if (map == null) {
            throw new IllegalStateException("Index cache is not initialized!");
        }
        Integer num = map.get(classFileEntry);
        if (num != null) {
            return num.intValue() + 1;
        }
        return -1;
    }

    public int size() {
        return this.entries.size();
    }

    public ClassFileEntry get(int i) {
        if (!this.resolved) {
            throw new IllegalStateException("Constant pool is not yet resolved; this does not make any sense");
        }
        return this.entries.get(i - 1);
    }

    public void resolve(Segment segment) {
        initialSort();
        sortClassPool();
        this.resolved = true;
        this.entries.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.lambda$resolve$0((ClassFileEntry) obj);
            }
        });
        this.others.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.lambda$resolve$1((ClassFileEntry) obj);
            }
        });
    }

    public final /* synthetic */ void lambda$resolve$0(ClassFileEntry classFileEntry) {
        classFileEntry.resolve(this);
    }

    public final /* synthetic */ void lambda$resolve$1(ClassFileEntry classFileEntry) {
        classFileEntry.resolve(this);
    }

    public final void initialSort() {
        TreeSet treeSet = new TreeSet(Comparator.comparingInt(new ToIntFunction() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda2
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ClassConstantPool.lambda$initialSort$2((ClassFileEntry) obj);
            }
        }));
        TreeSet treeSet2 = new TreeSet(Comparator.comparing(new Function() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ClassConstantPool.lambda$initialSort$3((ClassFileEntry) obj);
            }
        }));
        TreeSet treeSet3 = new TreeSet(Comparator.comparing(new Function() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ClassConstantPool.lambda$initialSort$4((ClassFileEntry) obj);
            }
        }));
        Iterator<ClassFileEntry> it = this.entries.iterator();
        while (it.hasNext()) {
            ConstantPoolEntry constantPoolEntry = (ConstantPoolEntry) it.next();
            if (constantPoolEntry.getGlobalIndex() == -1) {
                if (constantPoolEntry instanceof CPUTF8) {
                    treeSet2.add(constantPoolEntry);
                } else if (constantPoolEntry instanceof CPClass) {
                    treeSet3.add(constantPoolEntry);
                } else {
                    throw new Error("error");
                }
            } else {
                treeSet.add(constantPoolEntry);
            }
        }
        this.entries.clear();
        this.entries.addAll(treeSet);
        this.entries.addAll(treeSet2);
        this.entries.addAll(treeSet3);
    }

    public static /* synthetic */ int lambda$initialSort$2(ClassFileEntry classFileEntry) {
        return ((ConstantPoolEntry) classFileEntry).getGlobalIndex();
    }

    public static /* synthetic */ String lambda$initialSort$3(ClassFileEntry classFileEntry) {
        return ((CPUTF8) classFileEntry).underlyingString();
    }

    public static /* synthetic */ String lambda$initialSort$4(ClassFileEntry classFileEntry) {
        return ((CPClass) classFileEntry).getName();
    }

    public List<ClassFileEntry> entries() {
        return Collections.unmodifiableList(this.entries);
    }

    public void sortClassPool() {
        ArrayList<ClassFileEntry> arrayList = new ArrayList(this.entries.size());
        ArrayList<ClassFileEntry> arrayList2 = new ArrayList(this.entries.size());
        for (ClassFileEntry classFileEntry : this.entries) {
            if (this.mustStartClassPool.contains(classFileEntry)) {
                arrayList.add(classFileEntry);
            } else {
                arrayList2.add(classFileEntry);
            }
        }
        this.indexCache = new HashMap(this.entries.size());
        this.entries.clear();
        int i = 0;
        for (ClassFileEntry classFileEntry2 : arrayList) {
            this.indexCache.put(classFileEntry2, Integer.valueOf(i));
            if ((classFileEntry2 instanceof CPLong) || (classFileEntry2 instanceof CPDouble)) {
                this.entries.add(classFileEntry2);
                this.entries.add(classFileEntry2);
                i += 2;
            } else {
                this.entries.add(classFileEntry2);
                i++;
            }
        }
        for (ClassFileEntry classFileEntry3 : arrayList2) {
            this.indexCache.put(classFileEntry3, Integer.valueOf(i));
            if ((classFileEntry3 instanceof CPLong) || (classFileEntry3 instanceof CPDouble)) {
                this.entries.add(classFileEntry3);
                this.entries.add(classFileEntry3);
                i += 2;
            } else {
                this.entries.add(classFileEntry3);
                i++;
            }
        }
    }

    public ClassFileEntry addWithNestedEntries(ClassFileEntry classFileEntry) {
        add(classFileEntry);
        for (ClassFileEntry classFileEntry2 : classFileEntry.getNestedClassFileEntries()) {
            addWithNestedEntries(classFileEntry2);
        }
        return classFileEntry;
    }
}
