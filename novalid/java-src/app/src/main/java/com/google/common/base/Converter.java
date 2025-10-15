package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public abstract class Converter<A, B> implements Function<A, B> {
    public final boolean handleNullAutomatically;

    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient Converter<B, A> reverse;

    @ForOverride
    public abstract A doBackward(B b);

    @ForOverride
    public abstract B doForward(A a2);

    public Converter() {
        this(true);
    }

    public Converter(boolean handleNullAutomatically) {
        this.handleNullAutomatically = handleNullAutomatically;
    }

    @CheckForNull
    public final B convert(@CheckForNull A a2) {
        return correctedDoForward(a2);
    }

    @CheckForNull
    public B correctedDoForward(@CheckForNull A a2) {
        if (!this.handleNullAutomatically) {
            return unsafeDoForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return (B) Preconditions.checkNotNull(doForward(a2));
    }

    @CheckForNull
    public A correctedDoBackward(@CheckForNull B b) {
        if (!this.handleNullAutomatically) {
            return unsafeDoBackward(b);
        }
        if (b == null) {
            return null;
        }
        return (A) Preconditions.checkNotNull(doBackward(b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public final B unsafeDoForward(@CheckForNull A a2) {
        return (B) doForward(NullnessCasts.uncheckedCastNullableTToT(a2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public final A unsafeDoBackward(@CheckForNull B b) {
        return (A) doBackward(NullnessCasts.uncheckedCastNullableTToT(b));
    }

    /* renamed from: com.google.common.base.Converter$1 */
    /* loaded from: classes4.dex */
    public class C71591 implements Iterable<B> {
        public final /* synthetic */ Iterable val$fromIterable;

        public C71591(final Iterable val$fromIterable) {
            val$fromIterable = val$fromIterable;
        }

        /* renamed from: com.google.common.base.Converter$1$1 */
        public class AnonymousClass1 implements Iterator<B> {
            public final Iterator<? extends A> fromIterator;

            public AnonymousClass1() {
                this.fromIterator = val$fromIterable.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.fromIterator.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) Converter.this.convert(this.fromIterator.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.fromIterator.remove();
            }
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new Iterator<B>() { // from class: com.google.common.base.Converter.1.1
                public final Iterator<? extends A> fromIterator;

                public AnonymousClass1() {
                    this.fromIterator = val$fromIterable.iterator();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.fromIterator.hasNext();
                }

                @Override // java.util.Iterator
                public B next() {
                    return (B) Converter.this.convert(this.fromIterator.next());
                }

                @Override // java.util.Iterator
                public void remove() {
                    this.fromIterator.remove();
                }
            };
        }
    }

    public Iterable<B> convertAll(Iterable<? extends A> fromIterable) {
        Preconditions.checkNotNull(fromIterable, "fromIterable");
        return new Iterable<B>() { // from class: com.google.common.base.Converter.1
            public final /* synthetic */ Iterable val$fromIterable;

            public C71591(Iterable fromIterable2) {
                val$fromIterable = fromIterable2;
            }

            /* renamed from: com.google.common.base.Converter$1$1 */
            public class AnonymousClass1 implements Iterator<B> {
                public final Iterator<? extends A> fromIterator;

                public AnonymousClass1() {
                    this.fromIterator = val$fromIterable.iterator();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.fromIterator.hasNext();
                }

                @Override // java.util.Iterator
                public B next() {
                    return (B) Converter.this.convert(this.fromIterator.next());
                }

                @Override // java.util.Iterator
                public void remove() {
                    this.fromIterator.remove();
                }
            }

            @Override // java.lang.Iterable
            public Iterator<B> iterator() {
                return new Iterator<B>() { // from class: com.google.common.base.Converter.1.1
                    public final Iterator<? extends A> fromIterator;

                    public AnonymousClass1() {
                        this.fromIterator = val$fromIterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.fromIterator.hasNext();
                    }

                    @Override // java.util.Iterator
                    public B next() {
                        return (B) Converter.this.convert(this.fromIterator.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        this.fromIterator.remove();
                    }
                };
            }
        };
    }

    @CheckReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        ReverseConverter reverseConverter = new ReverseConverter(this);
        this.reverse = reverseConverter;
        return reverseConverter;
    }

    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        public static final long serialVersionUID = 0;
        public final Converter<A, B> original;

        public ReverseConverter(Converter<A, B> original) {
            this.original = original;
        }

        @Override // com.google.common.base.Converter
        public A doForward(B b) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public B doBackward(A a2) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        @CheckForNull
        public A correctedDoForward(@CheckForNull B b) {
            return this.original.correctedDoBackward(b);
        }

        @Override // com.google.common.base.Converter
        @CheckForNull
        public B correctedDoBackward(@CheckForNull A a2) {
            return this.original.correctedDoForward(a2);
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> reverse() {
            return this.original;
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof ReverseConverter) {
                return this.original.equals(((ReverseConverter) object).original);
            }
            return false;
        }

        public int hashCode() {
            return ~this.original.hashCode();
        }

        public String toString() {
            return this.original + ".reverse()";
        }
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> secondConverter) {
        return doAndThen(secondConverter);
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> secondConverter) {
        return new ConverterComposition(this, (Converter) Preconditions.checkNotNull(secondConverter));
    }

    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        public static final long serialVersionUID = 0;
        public final Converter<A, B> first;
        public final Converter<B, C> second;

        public ConverterComposition(Converter<A, B> first, Converter<B, C> second) {
            this.first = first;
            this.second = second;
        }

        @Override // com.google.common.base.Converter
        public C doForward(A a2) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public A doBackward(C c) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        @CheckForNull
        public C correctedDoForward(@CheckForNull A a2) {
            return (C) this.second.correctedDoForward(this.first.correctedDoForward(a2));
        }

        @Override // com.google.common.base.Converter
        @CheckForNull
        public A correctedDoBackward(@CheckForNull C c) {
            return (A) this.first.correctedDoBackward(this.second.correctedDoBackward(c));
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@CheckForNull Object object) {
            if (!(object instanceof ConverterComposition)) {
                return false;
            }
            ConverterComposition converterComposition = (ConverterComposition) object;
            return this.first.equals(converterComposition.first) && this.second.equals(converterComposition.second);
        }

        public int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public String toString() {
            return this.first + ".andThen(" + this.second + ")";
        }
    }

    @Override // com.google.common.base.Function
    @InlineMe(replacement = "this.convert(a)")
    @Deprecated
    public final B apply(A a2) {
        return convert(a2);
    }

    @Override // com.google.common.base.Function
    public boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> forwardFunction, Function<? super B, ? extends A> backwardFunction) {
        return new FunctionBasedConverter(forwardFunction, backwardFunction);
    }

    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        public final Function<? super B, ? extends A> backwardFunction;
        public final Function<? super A, ? extends B> forwardFunction;

        public /* synthetic */ FunctionBasedConverter(Function function, Function function2, C71591 c71591) {
            this(function, function2);
        }

        public FunctionBasedConverter(Function<? super A, ? extends B> forwardFunction, Function<? super B, ? extends A> backwardFunction) {
            this.forwardFunction = (Function) Preconditions.checkNotNull(forwardFunction);
            this.backwardFunction = (Function) Preconditions.checkNotNull(backwardFunction);
        }

        @Override // com.google.common.base.Converter
        public B doForward(A a2) {
            return this.forwardFunction.apply(a2);
        }

        @Override // com.google.common.base.Converter
        public A doBackward(B b) {
            return this.backwardFunction.apply(b);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@CheckForNull Object object) {
            if (!(object instanceof FunctionBasedConverter)) {
                return false;
            }
            FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) object;
            return this.forwardFunction.equals(functionBasedConverter.forwardFunction) && this.backwardFunction.equals(functionBasedConverter.backwardFunction);
        }

        public int hashCode() {
            return (this.forwardFunction.hashCode() * 31) + this.backwardFunction.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.forwardFunction + ", " + this.backwardFunction + ")";
        }
    }

    public static <T> Converter<T, T> identity() {
        return IdentityConverter.INSTANCE;
    }

    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        public static final IdentityConverter<?> INSTANCE = new IdentityConverter<>();
        public static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        public T doBackward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        public T doForward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        public IdentityConverter<T> reverse() {
            return this;
        }

        @Override // com.google.common.base.Converter
        public <S> Converter<T, S> doAndThen(Converter<T, S> otherConverter) {
            return (Converter) Preconditions.checkNotNull(otherConverter, "otherConverter");
        }

        public String toString() {
            return "Converter.identity()";
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }
}
