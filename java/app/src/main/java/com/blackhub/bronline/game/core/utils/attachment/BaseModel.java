package com.blackhub.bronline.game.core.utils.attachment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class BaseModel {
    public static final int $stable = 0;
    public final int awardId;

    @NotNull
    public final String imageName;
    public final int objectId;

    @Nullable
    public final String objectName;

    @Nullable
    public final String objectStoreName;
    public final int typeId;

    public BaseModel() {
        this(0, 0, 0, null, null, null, 63, null);
    }

    public static /* synthetic */ BaseModel copy$default(BaseModel baseModel, int i, int i2, int i3, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = baseModel.objectId;
        }
        if ((i4 & 2) != 0) {
            i2 = baseModel.typeId;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = baseModel.awardId;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            str = baseModel.imageName;
        }
        String str4 = str;
        if ((i4 & 16) != 0) {
            str2 = baseModel.objectName;
        }
        String str5 = str2;
        if ((i4 & 32) != 0) {
            str3 = baseModel.objectStoreName;
        }
        return baseModel.copy(i, i5, i6, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getObjectId() {
        return this.objectId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAwardId() {
        return this.awardId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getObjectName() {
        return this.objectName;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getObjectStoreName() {
        return this.objectStoreName;
    }

    @NotNull
    public final BaseModel copy(int objectId, int typeId, int awardId, @NotNull String imageName, @Nullable String objectName, @Nullable String objectStoreName) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return new BaseModel(objectId, typeId, awardId, imageName, objectName, objectStoreName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseModel)) {
            return false;
        }
        BaseModel baseModel = (BaseModel) other;
        return this.objectId == baseModel.objectId && this.typeId == baseModel.typeId && this.awardId == baseModel.awardId && Intrinsics.areEqual(this.imageName, baseModel.imageName) && Intrinsics.areEqual(this.objectName, baseModel.objectName) && Intrinsics.areEqual(this.objectStoreName, baseModel.objectStoreName);
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.objectId) * 31) + Integer.hashCode(this.typeId)) * 31) + Integer.hashCode(this.awardId)) * 31) + this.imageName.hashCode()) * 31;
        String str = this.objectName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.objectStoreName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseModel(objectId=" + this.objectId + ", typeId=" + this.typeId + ", awardId=" + this.awardId + ", imageName=" + this.imageName + ", objectName=" + this.objectName + ", objectStoreName=" + this.objectStoreName + ")";
    }

    public BaseModel(int i, int i2, int i3, @NotNull String imageName, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.objectId = i;
        this.typeId = i2;
        this.awardId = i3;
        this.imageName = imageName;
        this.objectName = str;
        this.objectStoreName = str2;
    }

    public final int getObjectId() {
        return this.objectId;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final int getAwardId() {
        return this.awardId;
    }

    public /* synthetic */ BaseModel(int i, int i2, int i3, String str, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) == 0 ? i3 : 0, (i4 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? null : str3);
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }

    @Nullable
    public final String getObjectName() {
        return this.objectName;
    }

    @Nullable
    public final String getObjectStoreName() {
        return this.objectStoreName;
    }
}

