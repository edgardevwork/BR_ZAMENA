package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Splitter {
    public final int limit;
    public final boolean omitEmptyStrings;
    public final Strategy strategy;
    public final CharMatcher trimmer;

    public interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence toSplit);
    }

    public Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    public Splitter(Strategy strategy, boolean omitEmptyStrings, CharMatcher trimmer, int limit) {
        this.strategy = strategy;
        this.omitEmptyStrings = omitEmptyStrings;
        this.trimmer = trimmer;
        this.limit = limit;
    }

    /* renamed from: on */
    public static Splitter m1150on(char separator) {
        return m1151on(CharMatcher.m1141is(separator));
    }

    /* renamed from: on */
    public static Splitter m1151on(final CharMatcher separatorMatcher) {
        Preconditions.checkNotNull(separatorMatcher);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1
            public C71731() {
            }

            /* renamed from: com.google.common.base.Splitter$1$1 */
            public class AnonymousClass1 extends SplittingIterator {
                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return separatorPosition + 1;
                }

                public AnonymousClass1(Splitter splitter, CharSequence toSplit) {
                    super(splitter, toSplit);
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int start) {
                    return val$separatorMatcher.indexIn(this.toSplit, start);
                }
            }

            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, final CharSequence toSplit) {
                return new SplittingIterator(splitter, toSplit) { // from class: com.google.common.base.Splitter.1.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int separatorPosition) {
                        return separatorPosition + 1;
                    }

                    public AnonymousClass1(Splitter splitter2, final CharSequence toSplit2) {
                        super(splitter2, toSplit2);
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int start) {
                        return val$separatorMatcher.indexIn(this.toSplit, start);
                    }
                };
            }
        });
    }

    /* renamed from: com.google.common.base.Splitter$1 */
    /* loaded from: classes8.dex */
    public class C71731 implements Strategy {
        public C71731() {
        }

        /* renamed from: com.google.common.base.Splitter$1$1 */
        public class AnonymousClass1 extends SplittingIterator {
            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int separatorPosition) {
                return separatorPosition + 1;
            }

            public AnonymousClass1(Splitter splitter2, final CharSequence toSplit2) {
                super(splitter2, toSplit2);
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int start) {
                return val$separatorMatcher.indexIn(this.toSplit, start);
            }
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter2, final CharSequence toSplit2) {
            return new SplittingIterator(splitter2, toSplit2) { // from class: com.google.common.base.Splitter.1.1
                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return separatorPosition + 1;
                }

                public AnonymousClass1(Splitter splitter22, final CharSequence toSplit22) {
                    super(splitter22, toSplit22);
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int start) {
                    return val$separatorMatcher.indexIn(this.toSplit, start);
                }
            };
        }
    }

    /* renamed from: on */
    public static Splitter m1152on(final String separator) {
        Preconditions.checkArgument(separator.length() != 0, "The separator may not be the empty string.");
        if (separator.length() == 1) {
            return m1150on(separator.charAt(0));
        }
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.2
            public final /* synthetic */ String val$separator;

            public C71742(final String separator2) {
                val$separator = separator2;
            }

            /* renamed from: com.google.common.base.Splitter$2$1 */
            public class AnonymousClass1 extends SplittingIterator {
                public AnonymousClass1(Splitter splitter, CharSequence toSplit) {
                    super(splitter, toSplit);
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
                
                    r6 = r6 + 1;
                 */
                @Override // com.google.common.base.Splitter.SplittingIterator
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public int separatorStart(int start) {
                    int length = val$separator.length();
                    int length2 = this.toSplit.length() - length;
                    while (start <= length2) {
                        for (int i = 0; i < length; i++) {
                            if (this.toSplit.charAt(i + start) != val$separator.charAt(i)) {
                                break;
                            }
                        }
                        return start;
                    }
                    return -1;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return separatorPosition + val$separator.length();
                }
            }

            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence toSplit) {
                return new SplittingIterator(splitter, toSplit) { // from class: com.google.common.base.Splitter.2.1
                    public AnonymousClass1(Splitter splitter2, CharSequence toSplit2) {
                        super(splitter2, toSplit2);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
                    
                        r6 = r6 + 1;
                     */
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public int separatorStart(int start) {
                        int length = val$separator.length();
                        int length2 = this.toSplit.length() - length;
                        while (start <= length2) {
                            for (int i = 0; i < length; i++) {
                                if (this.toSplit.charAt(i + start) != val$separator.charAt(i)) {
                                    break;
                                }
                            }
                            return start;
                        }
                        return -1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int separatorPosition) {
                        return separatorPosition + val$separator.length();
                    }
                };
            }
        });
    }

    /* renamed from: com.google.common.base.Splitter$2 */
    /* loaded from: classes8.dex */
    public class C71742 implements Strategy {
        public final /* synthetic */ String val$separator;

        public C71742(final String separator2) {
            val$separator = separator2;
        }

        /* renamed from: com.google.common.base.Splitter$2$1 */
        public class AnonymousClass1 extends SplittingIterator {
            public AnonymousClass1(Splitter splitter2, CharSequence toSplit2) {
                super(splitter2, toSplit2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
            
                r6 = r6 + 1;
             */
            @Override // com.google.common.base.Splitter.SplittingIterator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int separatorStart(int start) {
                int length = val$separator.length();
                int length2 = this.toSplit.length() - length;
                while (start <= length2) {
                    for (int i = 0; i < length; i++) {
                        if (this.toSplit.charAt(i + start) != val$separator.charAt(i)) {
                            break;
                        }
                    }
                    return start;
                }
                return -1;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int separatorPosition) {
                return separatorPosition + val$separator.length();
            }
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter2, CharSequence toSplit2) {
            return new SplittingIterator(splitter2, toSplit2) { // from class: com.google.common.base.Splitter.2.1
                public AnonymousClass1(Splitter splitter22, CharSequence toSplit22) {
                    super(splitter22, toSplit22);
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
                
                    r6 = r6 + 1;
                 */
                @Override // com.google.common.base.Splitter.SplittingIterator
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public int separatorStart(int start) {
                    int length = val$separator.length();
                    int length2 = this.toSplit.length() - length;
                    while (start <= length2) {
                        for (int i = 0; i < length; i++) {
                            if (this.toSplit.charAt(i + start) != val$separator.charAt(i)) {
                                break;
                            }
                        }
                        return start;
                    }
                    return -1;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return separatorPosition + val$separator.length();
                }
            };
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    /* renamed from: on */
    public static Splitter m1153on(Pattern separatorPattern) {
        return onPatternInternal(new JdkPattern(separatorPattern));
    }

    public static Splitter onPatternInternal(final CommonPattern separatorPattern) {
        Preconditions.checkArgument(!separatorPattern.matcher("").matches(), "The pattern may not match the empty string: %s", separatorPattern);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.3
            public C71753() {
            }

            /* renamed from: com.google.common.base.Splitter$3$1 */
            public class AnonymousClass1 extends SplittingIterator {
                public final /* synthetic */ CommonMatcher val$matcher;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(final C71753 this$0, Splitter splitter, CharSequence toSplit, final CommonMatcher val$matcher) {
                    super(splitter, toSplit);
                    val$matcher = val$matcher;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int start) {
                    if (val$matcher.find(start)) {
                        return val$matcher.start();
                    }
                    return -1;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return val$matcher.end();
                }
            }

            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(final Splitter splitter, CharSequence toSplit) {
                return new SplittingIterator(this, splitter, toSplit) { // from class: com.google.common.base.Splitter.3.1
                    public final /* synthetic */ CommonMatcher val$matcher;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(C71753 this, final Splitter splitter2, CharSequence toSplit2, final CommonMatcher val$matcher) {
                        super(splitter2, toSplit2);
                        val$matcher = val$matcher;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int start) {
                        if (val$matcher.find(start)) {
                            return val$matcher.start();
                        }
                        return -1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int separatorPosition) {
                        return val$matcher.end();
                    }
                };
            }
        });
    }

    /* renamed from: com.google.common.base.Splitter$3 */
    /* loaded from: classes8.dex */
    public class C71753 implements Strategy {
        public C71753() {
        }

        /* renamed from: com.google.common.base.Splitter$3$1 */
        public class AnonymousClass1 extends SplittingIterator {
            public final /* synthetic */ CommonMatcher val$matcher;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C71753 this, final Splitter splitter2, CharSequence toSplit2, final CommonMatcher val$matcher) {
                super(splitter2, toSplit2);
                val$matcher = val$matcher;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int start) {
                if (val$matcher.find(start)) {
                    return val$matcher.start();
                }
                return -1;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int separatorPosition) {
                return val$matcher.end();
            }
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(final Splitter splitter2, CharSequence toSplit2) {
            return new SplittingIterator(this, splitter2, toSplit2) { // from class: com.google.common.base.Splitter.3.1
                public final /* synthetic */ CommonMatcher val$matcher;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(C71753 this, final Splitter splitter22, CharSequence toSplit22, final CommonMatcher val$matcher) {
                    super(splitter22, toSplit22);
                    val$matcher = val$matcher;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int start) {
                    if (val$matcher.find(start)) {
                        return val$matcher.start();
                    }
                    return -1;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return val$matcher.end();
                }
            };
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Splitter onPattern(String separatorPattern) {
        return onPatternInternal(Platform.compilePattern(separatorPattern));
    }

    public static Splitter fixedLength(final int length) {
        Preconditions.checkArgument(length > 0, "The length may not be less than 1");
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.4
            public final /* synthetic */ int val$length;

            public C71764(final int length2) {
                val$length = length2;
            }

            /* renamed from: com.google.common.base.Splitter$4$1 */
            public class AnonymousClass1 extends SplittingIterator {
                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return separatorPosition;
                }

                public AnonymousClass1(Splitter splitter, CharSequence toSplit) {
                    super(splitter, toSplit);
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int start) {
                    int i = start + val$length;
                    if (i < this.toSplit.length()) {
                        return i;
                    }
                    return -1;
                }
            }

            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(final Splitter splitter, CharSequence toSplit) {
                return new SplittingIterator(splitter, toSplit) { // from class: com.google.common.base.Splitter.4.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int separatorPosition) {
                        return separatorPosition;
                    }

                    public AnonymousClass1(final Splitter splitter2, CharSequence toSplit2) {
                        super(splitter2, toSplit2);
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int start) {
                        int i = start + val$length;
                        if (i < this.toSplit.length()) {
                            return i;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    /* renamed from: com.google.common.base.Splitter$4 */
    /* loaded from: classes8.dex */
    public class C71764 implements Strategy {
        public final /* synthetic */ int val$length;

        public C71764(final int length2) {
            val$length = length2;
        }

        /* renamed from: com.google.common.base.Splitter$4$1 */
        public class AnonymousClass1 extends SplittingIterator {
            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int separatorPosition) {
                return separatorPosition;
            }

            public AnonymousClass1(final Splitter splitter2, CharSequence toSplit2) {
                super(splitter2, toSplit2);
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int start) {
                int i = start + val$length;
                if (i < this.toSplit.length()) {
                    return i;
                }
                return -1;
            }
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(final Splitter splitter2, CharSequence toSplit2) {
            return new SplittingIterator(splitter2, toSplit2) { // from class: com.google.common.base.Splitter.4.1
                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return separatorPosition;
                }

                public AnonymousClass1(final Splitter splitter22, CharSequence toSplit22) {
                    super(splitter22, toSplit22);
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int start) {
                    int i = start + val$length;
                    if (i < this.toSplit.length()) {
                        return i;
                    }
                    return -1;
                }
            };
        }
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public Splitter limit(int maxItems) {
        Preconditions.checkArgument(maxItems > 0, "must be greater than zero: %s", maxItems);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, maxItems);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    public Splitter trimResults(CharMatcher trimmer) {
        Preconditions.checkNotNull(trimmer);
        return new Splitter(this.strategy, this.omitEmptyStrings, trimmer, this.limit);
    }

    public Iterable<String> split(final CharSequence sequence) {
        Preconditions.checkNotNull(sequence);
        return new Iterable<String>() { // from class: com.google.common.base.Splitter.5
            public final /* synthetic */ CharSequence val$sequence;

            public C71775(final CharSequence sequence2) {
                val$sequence = sequence2;
            }

            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                return Splitter.this.splittingIterator(val$sequence);
            }

            public String toString() {
                Joiner joinerM1144on = Joiner.m1144on(", ");
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                StringBuilder sbAppendTo = joinerM1144on.appendTo(sb, (Iterable<? extends Object>) this);
                sbAppendTo.append(AbstractJsonLexerKt.END_LIST);
                return sbAppendTo.toString();
            }
        };
    }

    /* renamed from: com.google.common.base.Splitter$5 */
    public class C71775 implements Iterable<String> {
        public final /* synthetic */ CharSequence val$sequence;

        public C71775(final CharSequence sequence2) {
            val$sequence = sequence2;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return Splitter.this.splittingIterator(val$sequence);
        }

        public String toString() {
            Joiner joinerM1144on = Joiner.m1144on(", ");
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            StringBuilder sbAppendTo = joinerM1144on.appendTo(sb, (Iterable<? extends Object>) this);
            sbAppendTo.append(AbstractJsonLexerKt.END_LIST);
            return sbAppendTo.toString();
        }
    }

    public final Iterator<String> splittingIterator(CharSequence sequence) {
        return this.strategy.iterator(this, sequence);
    }

    public List<String> splitToList(CharSequence sequence) {
        Preconditions.checkNotNull(sequence);
        Iterator<String> itSplittingIterator = splittingIterator(sequence);
        ArrayList arrayList = new ArrayList();
        while (itSplittingIterator.hasNext()) {
            arrayList.add(itSplittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public MapSplitter withKeyValueSeparator(String separator) {
        return withKeyValueSeparator(m1152on(separator));
    }

    public MapSplitter withKeyValueSeparator(char separator) {
        return withKeyValueSeparator(m1150on(separator));
    }

    public MapSplitter withKeyValueSeparator(Splitter keyValueSplitter) {
        return new MapSplitter(keyValueSplitter);
    }

    public static final class MapSplitter {
        public static final String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        public final Splitter entrySplitter;
        public final Splitter outerSplitter;

        public /* synthetic */ MapSplitter(Splitter splitter, Splitter splitter2, C71731 c71731) {
            this(splitter, splitter2);
        }

        public MapSplitter(Splitter outerSplitter, Splitter entrySplitter) {
            this.outerSplitter = outerSplitter;
            this.entrySplitter = (Splitter) Preconditions.checkNotNull(entrySplitter);
        }

        public Map<String, String> split(CharSequence sequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.outerSplitter.split(sequence)) {
                Iterator itSplittingIterator = this.entrySplitter.splittingIterator(str);
                Preconditions.checkArgument(itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                String str2 = (String) itSplittingIterator.next();
                Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                Preconditions.checkArgument(itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                linkedHashMap.put(str2, (String) itSplittingIterator.next());
                Preconditions.checkArgument(!itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class SplittingIterator extends AbstractIterator<String> {
        public int limit;
        public int offset = 0;
        public final boolean omitEmptyStrings;
        public final CharSequence toSplit;
        public final CharMatcher trimmer;

        public abstract int separatorEnd(int separatorPosition);

        public abstract int separatorStart(int start);

        public SplittingIterator(Splitter splitter, CharSequence toSplit) {
            this.trimmer = splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = toSplit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x0060, code lost:
        
            r3 = r6.limit;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0063, code lost:
        
            if (r3 != 1) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0065, code lost:
        
            r1 = r6.toSplit.length();
            r6.offset = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x006d, code lost:
        
            if (r1 <= r0) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x007d, code lost:
        
            if (r6.trimmer.matches(r6.toSplit.charAt(r1 - 1)) == false) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x007f, code lost:
        
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0082, code lost:
        
            r6.limit = r3 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x008f, code lost:
        
            return r6.toSplit.subSequence(r0, r1).toString();
         */
        @Override // com.google.common.base.AbstractIterator
        @CheckForNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String computeNext() {
            int i = this.offset;
            while (true) {
                int i2 = this.offset;
                if (i2 != -1) {
                    int iSeparatorStart = separatorStart(i2);
                    if (iSeparatorStart == -1) {
                        iSeparatorStart = this.toSplit.length();
                        this.offset = -1;
                    } else {
                        this.offset = separatorEnd(iSeparatorStart);
                    }
                    int i3 = this.offset;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.offset = i4;
                        if (i4 > this.toSplit.length()) {
                            this.offset = -1;
                        }
                    } else {
                        while (i < iSeparatorStart && this.trimmer.matches(this.toSplit.charAt(i))) {
                            i++;
                        }
                        while (iSeparatorStart > i && this.trimmer.matches(this.toSplit.charAt(iSeparatorStart - 1))) {
                            iSeparatorStart--;
                        }
                        if (!this.omitEmptyStrings || i != iSeparatorStart) {
                            break;
                        }
                        i = this.offset;
                    }
                } else {
                    return endOfData();
                }
            }
        }
    }
}
