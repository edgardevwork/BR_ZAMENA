package com.blackhub.bronline.game.core.utils.attachment.task;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonTasksServerModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class CommonTasksServerModel {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int id;

    @SerializedName("p")
    public final int progress;

    @SerializedName("s")
    public final int status;

    public CommonTasksServerModel() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ CommonTasksServerModel copy$default(CommonTasksServerModel commonTasksServerModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = commonTasksServerModel.id;
        }
        if ((i4 & 2) != 0) {
            i2 = commonTasksServerModel.progress;
        }
        if ((i4 & 4) != 0) {
            i3 = commonTasksServerModel.status;
        }
        return commonTasksServerModel.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final CommonTasksServerModel copy(int id, int progress, int status) {
        return new CommonTasksServerModel(id, progress, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonTasksServerModel)) {
            return false;
        }
        CommonTasksServerModel commonTasksServerModel = (CommonTasksServerModel) other;
        return this.id == commonTasksServerModel.id && this.progress == commonTasksServerModel.progress && this.status == commonTasksServerModel.status;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.progress)) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "CommonTasksServerModel(id=" + this.id + ", progress=" + this.progress + ", status=" + this.status + ")";
    }

    public CommonTasksServerModel(int i, int i2, int i3) {
        this.id = i;
        this.progress = i2;
        this.status = i3;
    }

    public /* synthetic */ CommonTasksServerModel(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getId() {
        return this.id;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getStatus() {
        return this.status;
    }
}

