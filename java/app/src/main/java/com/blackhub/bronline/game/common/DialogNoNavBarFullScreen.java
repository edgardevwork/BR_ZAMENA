package com.blackhub.bronline.game.common;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentStateManager;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DialogNoNavBarFullScreen.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class DialogNoNavBarFullScreen extends Dialog {
    public static final int $stable = 8;

    /* renamed from: anim$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim;

    /* renamed from: timeChecker$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy timeChecker;

    @NotNull
    public abstract View getContentView();

    public abstract void initListeners();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogNoNavBarFullScreen(@NotNull final Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.anim = LazyKt__LazyJVMKt.lazy(new Function0<Animation>() { // from class: com.blackhub.bronline.game.common.DialogNoNavBarFullScreen$anim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Animation invoke() {
                return AnimationUtils.loadAnimation(context, R.anim.button_click);
            }
        });
        this.timeChecker = LazyKt__LazyJVMKt.lazy(new Function0<TimeChecker>() { // from class: com.blackhub.bronline.game.common.DialogNoNavBarFullScreen$timeChecker$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TimeChecker invoke() {
                return new TimeChecker();
            }
        });
    }

    @NotNull
    public final Animation getAnim() {
        Object value = this.anim.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Animation) value;
    }

    @NotNull
    public final TimeChecker getTimeChecker() {
        return (TimeChecker) this.timeChecker.getValue();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        UtilsKt.crashlyticsLog("DialogNoNavBarFullScreen onStart()");
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UtilsKt.crashlyticsLog("DialogNoNavBarFullScreen onCreate()");
        setContentView(getContentView());
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        initListeners();
    }

    @Override // android.app.Dialog
    public void show() {
        UtilsKt.crashlyticsLog("DialogNoNavBarFullScreen show(1)");
        Window window = getWindow();
        if (window != null) {
            window.setFlags(8, 8);
        }
        super.show();
        Window window2 = getWindow();
        UsefulKt.hideSystemUI(window2 != null ? window2.getDecorView() : null);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        window3.clearFlags(8);
        UtilsKt.crashlyticsLog("DialogNoNavBarFullScreen show(3)");
    }
}

