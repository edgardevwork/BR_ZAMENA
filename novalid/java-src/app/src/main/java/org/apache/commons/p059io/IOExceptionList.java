package org.apache.commons.p059io;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class IOExceptionList extends IOException {
    public static final long serialVersionUID = 1;
    public final List<? extends Throwable> causeList;

    public IOExceptionList(List<? extends Throwable> list) {
        this(String.format("%,d exceptions: %s", Integer.valueOf(list == null ? 0 : list.size()), list), list);
    }

    public IOExceptionList(String str, List<? extends Throwable> list) {
        super(str, (list == null || list.isEmpty()) ? null : list.get(0));
        this.causeList = list == null ? Collections.emptyList() : list;
    }

    public <T extends Throwable> T getCause(int i) {
        return (T) this.causeList.get(i);
    }

    public <T extends Throwable> T getCause(int i, Class<T> cls) {
        return cls.cast(this.causeList.get(i));
    }

    public <T extends Throwable> List<T> getCauseList() {
        return (List<T>) this.causeList;
    }

    public <T extends Throwable> List<T> getCauseList(Class<T> cls) {
        return (List<T>) this.causeList;
    }
}
