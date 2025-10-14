package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.util.NavigableMap;

@RequiresApi(19)
/* loaded from: classes4.dex */
public final class SizeStrategy implements LruPoolStrategy {
    public static final int MAX_SIZE_MULTIPLE = 8;
    public final KeyPool keyPool = new KeyPool();
    public final GroupedLinkedMap<Key, Bitmap> groupedMap = new GroupedLinkedMap<>();
    public final NavigableMap<Integer, Integer> sortedSizes = new PrettyPrintTreeMap();

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public void put(Bitmap bitmap) {
        Key key = this.keyPool.get(Util.getBitmapByteSize(bitmap));
        this.groupedMap.put(key, bitmap);
        Integer num = this.sortedSizes.get(Integer.valueOf(key.size));
        this.sortedSizes.put(Integer.valueOf(key.size), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @Nullable
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        int bitmapByteSize = Util.getBitmapByteSize(i, i2, config);
        Key key = this.keyPool.get(bitmapByteSize);
        Integer numCeilingKey = this.sortedSizes.ceilingKey(Integer.valueOf(bitmapByteSize));
        if (numCeilingKey != null && numCeilingKey.intValue() != bitmapByteSize && numCeilingKey.intValue() <= bitmapByteSize * 8) {
            this.keyPool.offer(key);
            key = this.keyPool.get(numCeilingKey.intValue());
        }
        Bitmap bitmap = this.groupedMap.get(key);
        if (bitmap != null) {
            bitmap.reconfigure(i, i2, config);
            decrementBitmapOfSize(numCeilingKey);
        }
        return bitmap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapRemoveLast = this.groupedMap.removeLast();
        if (bitmapRemoveLast != null) {
            decrementBitmapOfSize(Integer.valueOf(Util.getBitmapByteSize(bitmapRemoveLast)));
        }
        return bitmapRemoveLast;
    }

    public final void decrementBitmapOfSize(Integer num) {
        Integer num2 = this.sortedSizes.get(num);
        if (num2.intValue() == 1) {
            this.sortedSizes.remove(num);
        } else {
            this.sortedSizes.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public String logBitmap(Bitmap bitmap) {
        return getBitmapString(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public String logBitmap(int i, int i2, Bitmap.Config config) {
        return getBitmapString(Util.getBitmapByteSize(i, i2, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public int getSize(Bitmap bitmap) {
        return Util.getBitmapByteSize(bitmap);
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.groupedMap + "\n  SortedSizes" + this.sortedSizes;
    }

    private static String getBitmapString(Bitmap bitmap) {
        return getBitmapString(Util.getBitmapByteSize(bitmap));
    }

    public static String getBitmapString(int i) {
        return "[" + i + "]";
    }

    @VisibleForTesting
    public static class KeyPool extends BaseKeyPool<Key> {
        public Key get(int i) {
            Key key = (Key) super.get();
            key.init(i);
            return key;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public Key create() {
            return new Key(this);
        }
    }

    @VisibleForTesting
    public static final class Key implements Poolable {
        public final KeyPool pool;
        public int size;

        public Key(KeyPool keyPool) {
            this.pool = keyPool;
        }

        public void init(int i) {
            this.size = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Key) && this.size == ((Key) obj).size;
        }

        public int hashCode() {
            return this.size;
        }

        public String toString() {
            return SizeStrategy.getBitmapString(this.size);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public void offer() {
            this.pool.offer(this);
        }
    }
}
