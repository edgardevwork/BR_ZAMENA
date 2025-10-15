package com.blackhub.bronline.game.gui.inventory.adapters;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.blackhub.bronline.databinding.InventoryItemsItemBinding;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.network.InvActionWithJSON;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* compiled from: InventoryItemsAdapter.kt */
@Metadata(m7104d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010¨\u0006("}, m7105d2 = {"com/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsAdapter$ViewHolder$bind$1$4", "Landroid/view/View$OnTouchListener;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "isStopUsed", "", "()Z", "setStopUsed", "(Z)V", "motionXEnd", "", "getMotionXEnd", "()I", "setMotionXEnd", "(I)V", "motionXStart", "getMotionXStart", "setMotionXStart", "motionYEnd", "getMotionYEnd", "setMotionYEnd", "motionYStart", "getMotionYStart", "setMotionYStart", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "testCount", "getTestCount", "setTestCount", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class InventoryItemsAdapter$ViewHolder$bind$1$4 implements View.OnTouchListener {
    public final /* synthetic */ InventoryItemsItemBinding $_binding;
    public final /* synthetic */ Ref.BooleanRef $isEnd;
    public final /* synthetic */ InvItems $item;
    public final /* synthetic */ Function2<InvItems, Integer, Unit> $itemsClickListener;
    public boolean isStopUsed;
    public int motionXEnd;
    public int motionXStart;
    public int motionYEnd;
    public int motionYStart;
    public long startTime;
    public final /* synthetic */ InventoryItemsAdapter.ViewHolder this$0;
    public final /* synthetic */ InventoryItemsAdapter this$1;
    public int testCount = 500;

    @NotNull
    public final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX WARN: Multi-variable type inference failed */
    public InventoryItemsAdapter$ViewHolder$bind$1$4(InventoryItemsItemBinding inventoryItemsItemBinding, InvItems invItems, Ref.BooleanRef booleanRef, Function2<? super InvItems, ? super Integer, Unit> function2, InventoryItemsAdapter.ViewHolder viewHolder, InventoryItemsAdapter inventoryItemsAdapter) {
        this.$_binding = inventoryItemsItemBinding;
        this.$item = invItems;
        this.$isEnd = booleanRef;
        this.$itemsClickListener = function2;
        this.this$0 = viewHolder;
        this.this$1 = inventoryItemsAdapter;
    }

    public final int getMotionXStart() {
        return this.motionXStart;
    }

    public final void setMotionXStart(int i) {
        this.motionXStart = i;
    }

    public final int getMotionYStart() {
        return this.motionYStart;
    }

    public final void setMotionYStart(int i) {
        this.motionYStart = i;
    }

    public final int getMotionXEnd() {
        return this.motionXEnd;
    }

    public final void setMotionXEnd(int i) {
        this.motionXEnd = i;
    }

    public final int getMotionYEnd() {
        return this.motionYEnd;
    }

    public final void setMotionYEnd(int i) {
        this.motionYEnd = i;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    /* renamed from: isStopUsed, reason: from getter */
    public final boolean getIsStopUsed() {
        return this.isStopUsed;
    }

    public final void setStopUsed(boolean z) {
        this.isStopUsed = z;
    }

    public final int getTestCount() {
        return this.testCount;
    }

    public final void setTestCount(int i) {
        this.testCount = i;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x000c, B:11:0x0059, B:13:0x005e, B:15:0x0062, B:17:0x006c, B:20:0x007f, B:22:0x0091, B:24:0x00a4, B:25:0x00d3, B:27:0x00e8, B:28:0x00ea, B:30:0x00ef, B:31:0x00f1, B:33:0x00f5, B:38:0x010b, B:40:0x012d, B:44:0x0137, B:46:0x0149, B:48:0x015c, B:52:0x0197, B:35:0x00f8, B:37:0x00fc, B:53:0x01cc, B:55:0x01fb, B:49:0x0189), top: B:62:0x000c, inners: #1 }] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
        Function2<InvItems, Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            int height = this.$_binding.getRoot().getHeight();
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = height;
            final long j = 100 / (height / 5);
            ViewGroup.LayoutParams layoutParams = this.$_binding.testBottomFill.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            final Ref.BooleanRef booleanRef = this.$isEnd;
            final InventoryItemsItemBinding inventoryItemsItemBinding = this.$_binding;
            Thread thread = new Thread(new Runnable() { // from class: com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsAdapter$ViewHolder$bind$1$4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    InventoryItemsAdapter$ViewHolder$bind$1$4.onTouch$lambda$1(intRef, booleanRef, this, j, marginLayoutParams, inventoryItemsItemBinding);
                }
            });
            int action = event.getAction();
            if (action == 0) {
                this.motionXStart = (int) event.getX();
                this.motionYStart = (int) event.getY();
                this.startTime = System.currentTimeMillis();
                this.$_binding.testBottomFill.setVisibility(0);
                marginLayoutParams.topMargin = intRef.element;
                this.$_binding.testBottomFill.setLayoutParams(marginLayoutParams);
                if (this.$item.getItemsValue() != 0) {
                    thread.start();
                }
            } else if (action == 1) {
                this.motionXEnd = (int) event.getX();
                int y = (int) event.getY();
                this.motionYEnd = y;
                int i = this.motionXStart - this.motionXEnd;
                if (i < 0) {
                    i *= -1;
                }
                int i2 = this.motionYStart - y;
                if (i2 < 0) {
                    i2 *= -1;
                }
                if ((height / 3 > i || height / 3 > i2) && (function2 = this.$itemsClickListener) != null) {
                    function2.invoke(this.$item, Integer.valueOf(this.this$0.getBindingAdapterPosition()));
                }
                this.$_binding.testBottomFill.setVisibility(4);
                this.$isEnd.element = true;
                double dCurrentTimeMillis = (System.currentTimeMillis() - this.startTime) / 1000.0d;
                if (this.$item.getItemsValue() != 0 && !this.isStopUsed && dCurrentTimeMillis >= 1.0d && this.this$1.thisRoot.getOldTimeWithMigrateAndUsed() != System.currentTimeMillis() && System.currentTimeMillis() - this.this$1.thisRoot.getOldTimeWithMigrateAndUsed() > 1200) {
                    this.this$1.thisRoot.setOldTimeWithMigrateAndUsed(System.currentTimeMillis());
                    this.this$1.thisRoot.setIntermediateOldPositionInInvIfUsed(this.this$0.getBindingAdapterPosition());
                    InvActionWithJSON.INSTANCE.sendIdAndPositionToServer(19, this.$item.getId(), this.this$0.getBindingAdapterPosition());
                }
                try {
                    this.this$1.notifyItemChanged(this.this$0.getBindingAdapterPosition());
                } catch (Exception e) {
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    InventoryItemsAdapter.ViewHolder viewHolder = this.this$0;
                    InventoryItemsAdapter inventoryItemsAdapter = this.this$1;
                    firebaseCrashlytics.log("notifyItemChanged(" + viewHolder.getBindingAdapterPosition() + "), size = " + inventoryItemsAdapter.itemsList.size());
                    firebaseCrashlytics.recordException(e);
                }
            } else if (action != 2) {
                if (action != 3) {
                }
            } else if (this.testCount < 5 && !this.isStopUsed) {
                this.isStopUsed = true;
                this.$isEnd.element = true;
                Function2<InvItems, Integer, Unit> function22 = this.$itemsClickListener;
                if (function22 != null) {
                    function22.invoke(this.$item, Integer.valueOf(this.this$0.getBindingAdapterPosition()));
                }
                if (this.this$1.thisRoot.getOldTimeWithMigrateAndUsed() != System.currentTimeMillis() && System.currentTimeMillis() - this.this$1.thisRoot.getOldTimeWithMigrateAndUsed() > 1200) {
                    this.this$1.thisRoot.setOldTimeWithMigrateAndUsed(System.currentTimeMillis());
                    this.this$1.thisRoot.setIntermediateOldPositionInInvIfUsed(this.this$0.getBindingAdapterPosition());
                    InvActionWithJSON.INSTANCE.sendIdAndPositionToServer(19, this.$item.getId(), this.this$0.getBindingAdapterPosition());
                }
            }
        } catch (Exception e2) {
            Function2<InvItems, Integer, Unit> function23 = this.$itemsClickListener;
            if (function23 != null) {
                function23.invoke(this.$item, Integer.valueOf(this.this$0.getBindingAdapterPosition()));
            }
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics2.log("OutOfMemoryError");
            firebaseCrashlytics2.recordException(e2);
        }
        return true;
    }

    public static final void onTouch$lambda$1(final Ref.IntRef margin, Ref.BooleanRef isEnd, InventoryItemsAdapter$ViewHolder$bind$1$4 this$0, long j, final ViewGroup.MarginLayoutParams param, final InventoryItemsItemBinding _binding) {
        Intrinsics.checkNotNullParameter(margin, "$margin");
        Intrinsics.checkNotNullParameter(isEnd, "$isEnd");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(param, "$param");
        Intrinsics.checkNotNullParameter(_binding, "$_binding");
        while (true) {
            int i = margin.element;
            if (i <= 0 || isEnd.element) {
                return;
            }
            this$0.testCount = i;
            margin.element = i - 5;
            SystemClock.sleep(j);
            this$0.handler.post(new Runnable() { // from class: com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsAdapter$ViewHolder$bind$1$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    InventoryItemsAdapter$ViewHolder$bind$1$4.onTouch$lambda$1$lambda$0(param, margin, _binding);
                }
            });
        }
    }

    public static final void onTouch$lambda$1$lambda$0(ViewGroup.MarginLayoutParams param, Ref.IntRef margin, InventoryItemsItemBinding _binding) {
        Intrinsics.checkNotNullParameter(param, "$param");
        Intrinsics.checkNotNullParameter(margin, "$margin");
        Intrinsics.checkNotNullParameter(_binding, "$_binding");
        param.topMargin = margin.element;
        _binding.testBottomFill.setLayoutParams(param);
    }
}
