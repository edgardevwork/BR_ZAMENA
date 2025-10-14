package com.blackhub.bronline.game.gui.moduledialog;

import android.graphics.Bitmap;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModuleDialogUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class ModuleDialogUiState implements UiState {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap bgImageBitmap;

    @NotNull
    public final String button1Text;

    @NotNull
    public final String button2Text;

    @NotNull
    public final AnnotatedString description;
    public final boolean isNeedToClose;

    @NotNull
    public final String playersInQueueText;

    @NotNull
    public final String title;

    public ModuleDialogUiState() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static /* synthetic */ ModuleDialogUiState copy$default(ModuleDialogUiState moduleDialogUiState, String str, AnnotatedString annotatedString, String str2, String str3, String str4, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleDialogUiState.title;
        }
        if ((i & 2) != 0) {
            annotatedString = moduleDialogUiState.description;
        }
        AnnotatedString annotatedString2 = annotatedString;
        if ((i & 4) != 0) {
            str2 = moduleDialogUiState.button1Text;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = moduleDialogUiState.button2Text;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = moduleDialogUiState.playersInQueueText;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            bitmap = moduleDialogUiState.bgImageBitmap;
        }
        Bitmap bitmap2 = bitmap;
        if ((i & 64) != 0) {
            z = moduleDialogUiState.isNeedToClose;
        }
        return moduleDialogUiState.copy(str, annotatedString2, str5, str6, str7, bitmap2, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AnnotatedString getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getButton1Text() {
        return this.button1Text;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getButton2Text() {
        return this.button2Text;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPlayersInQueueText() {
        return this.playersInQueueText;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Bitmap getBgImageBitmap() {
        return this.bgImageBitmap;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsNeedToClose() {
        return this.isNeedToClose;
    }

    @NotNull
    public final ModuleDialogUiState copy(@NotNull String title, @NotNull AnnotatedString description, @NotNull String button1Text, @NotNull String button2Text, @NotNull String playersInQueueText, @Nullable Bitmap bgImageBitmap, boolean isNeedToClose) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(button1Text, "button1Text");
        Intrinsics.checkNotNullParameter(button2Text, "button2Text");
        Intrinsics.checkNotNullParameter(playersInQueueText, "playersInQueueText");
        return new ModuleDialogUiState(title, description, button1Text, button2Text, playersInQueueText, bgImageBitmap, isNeedToClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleDialogUiState)) {
            return false;
        }
        ModuleDialogUiState moduleDialogUiState = (ModuleDialogUiState) other;
        return Intrinsics.areEqual(this.title, moduleDialogUiState.title) && Intrinsics.areEqual(this.description, moduleDialogUiState.description) && Intrinsics.areEqual(this.button1Text, moduleDialogUiState.button1Text) && Intrinsics.areEqual(this.button2Text, moduleDialogUiState.button2Text) && Intrinsics.areEqual(this.playersInQueueText, moduleDialogUiState.playersInQueueText) && Intrinsics.areEqual(this.bgImageBitmap, moduleDialogUiState.bgImageBitmap) && this.isNeedToClose == moduleDialogUiState.isNeedToClose;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.button1Text.hashCode()) * 31) + this.button2Text.hashCode()) * 31) + this.playersInQueueText.hashCode()) * 31;
        Bitmap bitmap = this.bgImageBitmap;
        return ((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Boolean.hashCode(this.isNeedToClose);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        AnnotatedString annotatedString = this.description;
        return "ModuleDialogUiState(title=" + str + ", description=" + ((Object) annotatedString) + ", button1Text=" + this.button1Text + ", button2Text=" + this.button2Text + ", playersInQueueText=" + this.playersInQueueText + ", bgImageBitmap=" + this.bgImageBitmap + ", isNeedToClose=" + this.isNeedToClose + ")";
    }

    public ModuleDialogUiState(@NotNull String title, @NotNull AnnotatedString description, @NotNull String button1Text, @NotNull String button2Text, @NotNull String playersInQueueText, @Nullable Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(button1Text, "button1Text");
        Intrinsics.checkNotNullParameter(button2Text, "button2Text");
        Intrinsics.checkNotNullParameter(playersInQueueText, "playersInQueueText");
        this.title = title;
        this.description = description;
        this.button1Text = button1Text;
        this.button2Text = button2Text;
        this.playersInQueueText = playersInQueueText;
        this.bgImageBitmap = bitmap;
        this.isNeedToClose = z;
    }

    public /* synthetic */ ModuleDialogUiState(String str, AnnotatedString annotatedString, String str2, String str3, String str4, Bitmap bitmap, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 2) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i & 32) != 0 ? null : bitmap, (i & 64) != 0 ? false : z);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final AnnotatedString getDescription() {
        return this.description;
    }

    @NotNull
    public final String getButton1Text() {
        return this.button1Text;
    }

    @NotNull
    public final String getButton2Text() {
        return this.button2Text;
    }

    @NotNull
    public final String getPlayersInQueueText() {
        return this.playersInQueueText;
    }

    @Nullable
    public final Bitmap getBgImageBitmap() {
        return this.bgImageBitmap;
    }

    public final boolean isNeedToClose() {
        return this.isNeedToClose;
    }
}

