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
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/attachment/BaseModel;", "", "objectId", "", "typeId", "awardId", "imageName", "", "objectName", "objectStoreName", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAwardId", "()I", "getImageName", "()Ljava/lang/String;", "getObjectId", "getObjectName", "getObjectStoreName", "getTypeId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
