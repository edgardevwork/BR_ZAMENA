package ru.rustore.sdk.coreui;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DialogHelper.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u001ac\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0002\u0010\f\u001ag\u0010\r\u001a\u00020\t\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\t*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¨\u0006\u0013"}, m7105d2 = {"createDialog", "Landroidx/appcompat/app/AlertDialog;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/coreui/DialogState;", "context", "Landroid/content/Context;", "state", "onConfirmClick", "Lkotlin/Function1;", "", "onCancelClick", "onDismiss", "(Landroid/content/Context;Lru/rustore/sdk/coreui/DialogState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/appcompat/app/AlertDialog;", "showDialog", "(Landroid/content/Context;Lru/rustore/sdk/coreui/DialogState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "applyButtonColors", "textColor", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "sdk-public-coreui_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class DialogHelperKt {
    public static /* synthetic */ void showDialog$default(Context context, DialogState dialogState, Function1 function1, Function1 function12, Function1 function13, int i, Object obj) {
        if ((i & 8) != 0) {
            function12 = new Function1<Object, Unit>() { // from class: ru.rustore.sdk.coreui.DialogHelperKt.showDialog.1
                public final void invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke(obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 16) != 0) {
            function13 = new Function1<Object, Unit>() { // from class: ru.rustore.sdk.coreui.DialogHelperKt.showDialog.2
                public final void invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke(obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        showDialog(context, dialogState, function1, function12, function13);
    }

    @Deprecated(message = "Удалить вместе с resolveForBilling")
    public static final <T extends DialogState> void showDialog(@NotNull Context context, @NotNull T state, @NotNull Function1<? super T, Unit> onConfirmClick, @NotNull Function1<? super T, Unit> onCancelClick, @NotNull Function1<? super T, Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        AlertDialog alertDialogCreateDialog = createDialog(context, state, onConfirmClick, onCancelClick, onDismiss);
        alertDialogCreateDialog.show();
        applyButtonColors(alertDialogCreateDialog, context.getColor(C11581R.color.alert_dialog_button), context.getColor(android.R.color.transparent));
    }

    @Deprecated(message = "RUSTORE-39764 Удалить вместе с resolveForBilling")
    public static final <T extends DialogState> AlertDialog createDialog(Context context, final T t, final Function1<? super T, Unit> function1, final Function1<? super T, Unit> function12, final Function1<? super T, Unit> function13) {
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(new ContextThemeWrapper(context, C11581R.style.Theme_RuStoreSdk_Transparent));
        materialAlertDialogBuilder.setTitle(t.getTitleRes());
        materialAlertDialogBuilder.setMessage(t.getMessageRes());
        Integer confirmButtonTextRes = t.getConfirmButtonTextRes();
        if (confirmButtonTextRes != null) {
            materialAlertDialogBuilder.setPositiveButton(confirmButtonTextRes.intValue(), new DialogInterface.OnClickListener() { // from class: ru.rustore.sdk.coreui.DialogHelperKt$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DialogHelperKt.createDialog$lambda$6$lambda$2$lambda$1(function1, t, dialogInterface, i);
                }
            });
        }
        Integer cancelButtonTextRes = t.getCancelButtonTextRes();
        if (cancelButtonTextRes != null) {
            materialAlertDialogBuilder.setNegativeButton(cancelButtonTextRes.intValue(), new DialogInterface.OnClickListener() { // from class: ru.rustore.sdk.coreui.DialogHelperKt$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DialogHelperKt.createDialog$lambda$6$lambda$4$lambda$3(function12, t, dialogInterface, i);
                }
            });
        }
        materialAlertDialogBuilder.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ru.rustore.sdk.coreui.DialogHelperKt$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogHelperKt.createDialog$lambda$6$lambda$5(function13, t, dialogInterface);
            }
        });
        AlertDialog alertDialogCreate = materialAlertDialogBuilder.create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "MaterialAlertDialogBuild…e(state) }\n    }.create()");
        return alertDialogCreate;
    }

    public static final void createDialog$lambda$6$lambda$2$lambda$1(Function1 onConfirmClick, DialogState state, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(onConfirmClick, "$onConfirmClick");
        Intrinsics.checkNotNullParameter(state, "$state");
        onConfirmClick.invoke(state);
    }

    public static final void createDialog$lambda$6$lambda$4$lambda$3(Function1 onCancelClick, DialogState state, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(onCancelClick, "$onCancelClick");
        Intrinsics.checkNotNullParameter(state, "$state");
        onCancelClick.invoke(state);
    }

    public static final void createDialog$lambda$6$lambda$5(Function1 onDismiss, DialogState state, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
        Intrinsics.checkNotNullParameter(state, "$state");
        onDismiss.invoke(state);
    }

    @Deprecated(message = "RUSTORE-39764 Удалить вместе с resolveForBilling")
    public static final void applyButtonColors(AlertDialog alertDialog, int i, int i2) {
        int[] iArr = {-2, -3, -1};
        for (int i3 = 0; i3 < 3; i3++) {
            Button button = alertDialog.getButton(iArr[i3]);
            button.setTextColor(i);
            button.setBackgroundColor(i2);
        }
    }
}
