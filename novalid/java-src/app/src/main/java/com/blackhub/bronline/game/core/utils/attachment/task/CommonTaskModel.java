package com.blackhub.bronline.game.core.utils.attachment.task;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.bless.client.R;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonTaskModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0011HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\t\u00106\u001a\u00020\u000fHÆ\u0003J~\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00032\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0005HÖ\u0001J\t\u0010<\u001a\u00020\bHÖ\u0001R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0015¨\u0006="}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "", "notActive", "", "id", "", "typeId", "title", "", "description", "Landroidx/compose/ui/text/AnnotatedString;", CatchStreamerKeys.COUNT_KEY, "award", "rublesReward", "imageModel", "Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "stateOfTask", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskState;", "buttonType", "(ZIILjava/lang/String;Landroidx/compose/ui/text/AnnotatedString;IILjava/lang/Integer;Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskState;I)V", "getAward", "()I", "getButtonType", "getCount", "getDescription", "()Landroidx/compose/ui/text/AnnotatedString;", "iconButtonColor", "getIconButtonColor", "iconButtonSize", "getIconButtonSize", "getId", "getImageModel", "()Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "isWithVIP", "()Z", "getNotActive", "getRublesReward", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStateOfTask", "()Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskState;", "getTitle", "()Ljava/lang/String;", "getTypeId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZIILjava/lang/String;Landroidx/compose/ui/text/AnnotatedString;IILjava/lang/Integer;Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskState;I)Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommonTaskModel {
    public static final int $stable = 0;
    public final int award;
    public final int buttonType;
    public final int count;

    @NotNull
    public final AnnotatedString description;
    public final int id;

    @NotNull
    public final ImageModel imageModel;
    public final boolean notActive;

    @Nullable
    public final Integer rublesReward;

    @NotNull
    public final CommonTaskState stateOfTask;

    @NotNull
    public final String title;
    public final int typeId;

    public CommonTaskModel() {
        this(false, 0, 0, null, null, 0, 0, null, null, null, 0, DoubleToDecimal.BQ_MASK, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getNotActive() {
        return this.notActive;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final CommonTaskState getStateOfTask() {
        return this.stateOfTask;
    }

    /* renamed from: component11, reason: from getter */
    public final int getButtonType() {
        return this.buttonType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AnnotatedString getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAward() {
        return this.award;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getRublesReward() {
        return this.rublesReward;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final ImageModel getImageModel() {
        return this.imageModel;
    }

    @NotNull
    public final CommonTaskModel copy(boolean notActive, int id, int typeId, @NotNull String title, @NotNull AnnotatedString description, int count, int award, @Nullable Integer rublesReward, @NotNull ImageModel imageModel, @NotNull CommonTaskState stateOfTask, int buttonType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        Intrinsics.checkNotNullParameter(stateOfTask, "stateOfTask");
        return new CommonTaskModel(notActive, id, typeId, title, description, count, award, rublesReward, imageModel, stateOfTask, buttonType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonTaskModel)) {
            return false;
        }
        CommonTaskModel commonTaskModel = (CommonTaskModel) other;
        return this.notActive == commonTaskModel.notActive && this.id == commonTaskModel.id && this.typeId == commonTaskModel.typeId && Intrinsics.areEqual(this.title, commonTaskModel.title) && Intrinsics.areEqual(this.description, commonTaskModel.description) && this.count == commonTaskModel.count && this.award == commonTaskModel.award && Intrinsics.areEqual(this.rublesReward, commonTaskModel.rublesReward) && Intrinsics.areEqual(this.imageModel, commonTaskModel.imageModel) && this.stateOfTask == commonTaskModel.stateOfTask && this.buttonType == commonTaskModel.buttonType;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Boolean.hashCode(this.notActive) * 31) + Integer.hashCode(this.id)) * 31) + Integer.hashCode(this.typeId)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.award)) * 31;
        Integer num = this.rublesReward;
        return ((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.imageModel.hashCode()) * 31) + this.stateOfTask.hashCode()) * 31) + Integer.hashCode(this.buttonType);
    }

    @NotNull
    public String toString() {
        boolean z = this.notActive;
        int i = this.id;
        int i2 = this.typeId;
        String str = this.title;
        AnnotatedString annotatedString = this.description;
        return "CommonTaskModel(notActive=" + z + ", id=" + i + ", typeId=" + i2 + ", title=" + str + ", description=" + ((Object) annotatedString) + ", count=" + this.count + ", award=" + this.award + ", rublesReward=" + this.rublesReward + ", imageModel=" + this.imageModel + ", stateOfTask=" + this.stateOfTask + ", buttonType=" + this.buttonType + ")";
    }

    public CommonTaskModel(boolean z, int i, int i2, @NotNull String title, @NotNull AnnotatedString description, int i3, int i4, @Nullable Integer num, @NotNull ImageModel imageModel, @NotNull CommonTaskState stateOfTask, int i5) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        Intrinsics.checkNotNullParameter(stateOfTask, "stateOfTask");
        this.notActive = z;
        this.id = i;
        this.typeId = i2;
        this.title = title;
        this.description = description;
        this.count = i3;
        this.award = i4;
        this.rublesReward = num;
        this.imageModel = imageModel;
        this.stateOfTask = stateOfTask;
        this.buttonType = i5;
    }

    public final boolean getNotActive() {
        return this.notActive;
    }

    public final int getId() {
        return this.id;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public /* synthetic */ CommonTaskModel(boolean z, int i, int i2, String str, AnnotatedString annotatedString, int i3, int i4, Integer num, ImageModel imageModel, CommonTaskState commonTaskState, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 16) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? null : num, (i6 & 256) != 0 ? new ImageModel(0, null, null, null, null, 31, null) : imageModel, (i6 & 512) != 0 ? CommonTaskState.TRACK_STATE : commonTaskState, (i6 & 1024) == 0 ? i5 : 0);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final AnnotatedString getDescription() {
        return this.description;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getAward() {
        return this.award;
    }

    @Nullable
    public final Integer getRublesReward() {
        return this.rublesReward;
    }

    @NotNull
    public final ImageModel getImageModel() {
        return this.imageModel;
    }

    @NotNull
    public final CommonTaskState getStateOfTask() {
        return this.stateOfTask;
    }

    public final int getButtonType() {
        return this.buttonType;
    }

    @DimenRes
    public final int getIconButtonSize() {
        return this.stateOfTask == CommonTaskState.COMPLETED_STATE ? R.dimen._32wdp : R.dimen._16wdp;
    }

    @ColorRes
    public final int getIconButtonColor() {
        return this.stateOfTask == CommonTaskState.COMPLETED_STATE ? R.color.black_50 : R.color.black;
    }

    public final boolean isWithVIP() {
        return this.stateOfTask != CommonTaskState.UNAVAILABLE_STATE;
    }
}
