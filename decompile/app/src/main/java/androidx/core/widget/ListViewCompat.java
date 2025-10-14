package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes4.dex */
public final class ListViewCompat {
    @Deprecated
    public static void scrollListBy(@NonNull ListView listView, int i) {
        listView.scrollListBy(i);
    }

    @Deprecated
    public static boolean canScrollList(@NonNull ListView listView, int i) {
        return listView.canScrollList(i);
    }
}
