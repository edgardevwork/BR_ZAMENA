package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class Joiner {
    public final String separator;

    /* renamed from: on */
    public static Joiner m1144on(String separator) {
        return new Joiner(separator);
    }

    /* renamed from: on */
    public static Joiner m1143on(char separator) {
        return new Joiner(String.valueOf(separator));
    }

    public Joiner(String separator) {
        this.separator = (String) Preconditions.checkNotNull(separator);
    }

    public Joiner(Joiner prototype) {
        this.separator = prototype.separator;
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a2, Iterable<? extends Object> iterable) throws IOException {
        return (A) appendTo((Joiner) a2, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A appendable, Iterator<? extends Object> parts) throws IOException {
        Preconditions.checkNotNull(appendable);
        if (parts.hasNext()) {
            appendable.append(toString(parts.next()));
            while (parts.hasNext()) {
                appendable.append(this.separator);
                appendable.append(toString(parts.next()));
            }
        }
        return appendable;
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a2, Object[] objArr) throws IOException {
        return (A) appendTo((Joiner) a2, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a2, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) throws IOException {
        return (A) appendTo((Joiner) a2, iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder builder, Iterable<? extends Object> parts) {
        return appendTo(builder, parts.iterator());
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder builder, Iterator<? extends Object> parts) {
        try {
            appendTo((Joiner) builder, parts);
            return builder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder builder, Object[] parts) {
        return appendTo(builder, (Iterable<? extends Object>) Arrays.asList(parts));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder builder, @CheckForNull Object first, @CheckForNull Object second, Object... rest) {
        return appendTo(builder, iterable(first, second, rest));
    }

    public final String join(Iterable<? extends Object> parts) {
        return join(parts.iterator());
    }

    public final String join(Iterator<? extends Object> parts) {
        return appendTo(new StringBuilder(), parts).toString();
    }

    public final String join(Object[] parts) {
        return join(Arrays.asList(parts));
    }

    public final String join(@CheckForNull Object first, @CheckForNull Object second, Object... rest) {
        return join(iterable(first, second, rest));
    }

    public Joiner useForNull(final String nullText) {
        Preconditions.checkNotNull(nullText);
        return new Joiner(this) { // from class: com.google.common.base.Joiner.1
            @Override // com.google.common.base.Joiner
            public CharSequence toString(@CheckForNull Object part) {
                return part == null ? nullText : Joiner.this.toString(part);
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String nullText2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            @Override // com.google.common.base.Joiner
            public Joiner skipNulls() {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public Joiner skipNulls() {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.2
            @Override // com.google.common.base.Joiner
            public <A extends Appendable> A appendTo(A appendable, Iterator<? extends Object> parts) throws IOException {
                Preconditions.checkNotNull(appendable, "appendable");
                Preconditions.checkNotNull(parts, "parts");
                while (true) {
                    if (!parts.hasNext()) {
                        break;
                    }
                    Object next = parts.next();
                    if (next != null) {
                        appendable.append(Joiner.this.toString(next));
                        break;
                    }
                }
                while (parts.hasNext()) {
                    Object next2 = parts.next();
                    if (next2 != null) {
                        appendable.append(Joiner.this.separator);
                        appendable.append(Joiner.this.toString(next2));
                    }
                }
                return appendable;
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String nullText) {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            @Override // com.google.common.base.Joiner
            public MapJoiner withKeyValueSeparator(String kvs) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public MapJoiner withKeyValueSeparator(char keyValueSeparator) {
        return withKeyValueSeparator(String.valueOf(keyValueSeparator));
    }

    public MapJoiner withKeyValueSeparator(String keyValueSeparator) {
        return new MapJoiner(keyValueSeparator);
    }

    public static final class MapJoiner {
        public final Joiner joiner;
        public final String keyValueSeparator;

        public MapJoiner(Joiner joiner, String keyValueSeparator) {
            this.joiner = joiner;
            this.keyValueSeparator = (String) Preconditions.checkNotNull(keyValueSeparator);
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a2, Map<?, ?> map) throws IOException {
            return (A) appendTo((MapJoiner) a2, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder builder, Map<?, ?> map) {
            return appendTo(builder, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a2, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo((MapJoiner) a2, iterable.iterator());
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A appendable, Iterator<? extends Map.Entry<?, ?>> parts) throws IOException {
            Preconditions.checkNotNull(appendable);
            if (parts.hasNext()) {
                Map.Entry<?, ?> next = parts.next();
                appendable.append(this.joiner.toString(next.getKey()));
                appendable.append(this.keyValueSeparator);
                appendable.append(this.joiner.toString(next.getValue()));
                while (parts.hasNext()) {
                    appendable.append(this.joiner.separator);
                    Map.Entry<?, ?> next2 = parts.next();
                    appendable.append(this.joiner.toString(next2.getKey()));
                    appendable.append(this.keyValueSeparator);
                    appendable.append(this.joiner.toString(next2.getValue()));
                }
            }
            return appendable;
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder builder, Iterable<? extends Map.Entry<?, ?>> entries) {
            return appendTo(builder, entries.iterator());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder builder, Iterator<? extends Map.Entry<?, ?>> entries) {
            try {
                appendTo((MapJoiner) builder, entries);
                return builder;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> entries) {
            return join(entries.iterator());
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> entries) {
            return appendTo(new StringBuilder(), entries).toString();
        }

        public MapJoiner useForNull(String nullText) {
            return new MapJoiner(this.joiner.useForNull(nullText), this.keyValueSeparator);
        }
    }

    public CharSequence toString(@CheckForNull Object part) {
        java.util.Objects.requireNonNull(part);
        return part instanceof CharSequence ? (CharSequence) part : part.toString();
    }

    public static Iterable<Object> iterable(@CheckForNull final Object first, @CheckForNull final Object second, final Object[] rest) {
        Preconditions.checkNotNull(rest);
        return new AbstractList<Object>() { // from class: com.google.common.base.Joiner.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return rest.length + 2;
            }

            @Override // java.util.AbstractList, java.util.List
            @CheckForNull
            public Object get(int index) {
                if (index == 0) {
                    return first;
                }
                if (index == 1) {
                    return second;
                }
                return rest[index - 2];
            }
        };
    }
}
