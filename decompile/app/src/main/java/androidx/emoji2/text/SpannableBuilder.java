package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class SpannableBuilder extends SpannableStringBuilder {

    @NonNull
    public final Class<?> mWatcherClass;

    @NonNull
    public final List<WatcherWrapper> mWatchers;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SpannableBuilder(@NonNull Class<?> cls) {
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SpannableBuilder(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SpannableBuilder(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static SpannableBuilder create(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new SpannableBuilder(cls, charSequence);
    }

    public final boolean isWatcher(@Nullable Object obj) {
        return obj != null && isWatcher(obj.getClass());
    }

    public final boolean isWatcher(@NonNull Class<?> cls) {
        return this.mWatcherClass == cls;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new SpannableBuilder(this.mWatcherClass, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@Nullable Object obj, int i, int i2, int i3) {
        if (isWatcher(obj)) {
            WatcherWrapper watcherWrapper = new WatcherWrapper(obj);
            this.mWatchers.add(watcherWrapper);
            obj = watcherWrapper;
        }
        super.setSpan(obj, i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, @NonNull Class<T> cls) {
        if (isWatcher((Class<?>) cls)) {
            WatcherWrapper[] watcherWrapperArr = (WatcherWrapper[]) super.getSpans(i, i2, WatcherWrapper.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, watcherWrapperArr.length));
            for (int i3 = 0; i3 < watcherWrapperArr.length; i3++) {
                tArr[i3] = watcherWrapperArr[i3].mObject;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@Nullable Object obj) {
        WatcherWrapper watcherFor;
        if (isWatcher(obj)) {
            watcherFor = getWatcherFor(obj);
            if (watcherFor != null) {
                obj = watcherFor;
            }
        } else {
            watcherFor = null;
        }
        super.removeSpan(obj);
        if (watcherFor != null) {
            this.mWatchers.remove(watcherFor);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@Nullable Object obj) {
        WatcherWrapper watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@Nullable Object obj) {
        WatcherWrapper watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@Nullable Object obj) {
        WatcherWrapper watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, @Nullable Class cls) {
        if (cls == null || isWatcher((Class<?>) cls)) {
            cls = WatcherWrapper.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final WatcherWrapper getWatcherFor(Object obj) {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            WatcherWrapper watcherWrapper = this.mWatchers.get(i);
            if (watcherWrapper.mObject == obj) {
                return watcherWrapper;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void beginBatchEdit() {
        blockWatchers();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void endBatchEdit() {
        unblockwatchers();
        fireWatchers();
    }

    public final void blockWatchers() {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).blockCalls();
        }
    }

    public final void unblockwatchers() {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).unblockCalls();
        }
    }

    public final void fireWatchers() {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        blockWatchers();
        super.replace(i, i2, charSequence);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        blockWatchers();
        super.replace(i, i2, charSequence, i3, i4);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    public static class WatcherWrapper implements TextWatcher, SpanWatcher {
        public final AtomicInteger mBlockCalls = new AtomicInteger(0);
        public final Object mObject;

        public WatcherWrapper(Object obj) {
            this.mObject = obj;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.mObject).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.mObject).onTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.mObject).afterTextChanged(editable);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                ((SpanWatcher) this.mObject).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                ((SpanWatcher) this.mObject).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r11
  0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i5 = i;
                    i6 = i3;
                } else {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                    }
                }
                ((SpanWatcher) this.mObject).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        public final void blockCalls() {
            this.mBlockCalls.incrementAndGet();
        }

        public final void unblockCalls() {
            this.mBlockCalls.decrementAndGet();
        }

        public final boolean isEmojiSpan(Object obj) {
            return obj instanceof EmojiSpan;
        }
    }
}
