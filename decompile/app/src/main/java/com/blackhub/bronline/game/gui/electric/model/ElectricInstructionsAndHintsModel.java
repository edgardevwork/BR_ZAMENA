package com.blackhub.bronline.game.gui.electric.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ElectricInstructionsAndHintsModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/model/ElectricInstructionsAndHintsModel;", "", "seen1", "", "textInstructions", "", "textHintList", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;)V", "getTextHintList", "()Ljava/util/List;", "getTextInstructions", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", P2ArtifactParser.RuleHandler.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_siteRelease", "$serializer", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class ElectricInstructionsAndHintsModel {

    @SerializedName(BlackPassKeys.TH_TIMER_MS)
    @NotNull
    public final List<String> textHintList;

    @SerializedName("ti")
    @NotNull
    public final String textInstructions;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    @NotNull
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public ElectricInstructionsAndHintsModel() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ElectricInstructionsAndHintsModel copy$default(ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = electricInstructionsAndHintsModel.textInstructions;
        }
        if ((i & 2) != 0) {
            list = electricInstructionsAndHintsModel.textHintList;
        }
        return electricInstructionsAndHintsModel.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTextInstructions() {
        return this.textInstructions;
    }

    @NotNull
    public final List<String> component2() {
        return this.textHintList;
    }

    @NotNull
    public final ElectricInstructionsAndHintsModel copy(@NotNull String textInstructions, @NotNull List<String> textHintList) {
        Intrinsics.checkNotNullParameter(textInstructions, "textInstructions");
        Intrinsics.checkNotNullParameter(textHintList, "textHintList");
        return new ElectricInstructionsAndHintsModel(textInstructions, textHintList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectricInstructionsAndHintsModel)) {
            return false;
        }
        ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel = (ElectricInstructionsAndHintsModel) other;
        return Intrinsics.areEqual(this.textInstructions, electricInstructionsAndHintsModel.textInstructions) && Intrinsics.areEqual(this.textHintList, electricInstructionsAndHintsModel.textHintList);
    }

    public int hashCode() {
        return (this.textInstructions.hashCode() * 31) + this.textHintList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ElectricInstructionsAndHintsModel(textInstructions=" + this.textInstructions + ", textHintList=" + this.textHintList + ")";
    }

    /* compiled from: ElectricInstructionsAndHintsModel.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/model/ElectricInstructionsAndHintsModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/blackhub/bronline/game/gui/electric/model/ElectricInstructionsAndHintsModel;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KSerializer<ElectricInstructionsAndHintsModel> serializer() {
            return ElectricInstructionsAndHintsModel$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ElectricInstructionsAndHintsModel(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.textInstructions = (i & 1) == 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str;
        if ((i & 2) == 0) {
            this.textHintList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            this.textHintList = list;
        }
    }

    public ElectricInstructionsAndHintsModel(@NotNull String textInstructions, @NotNull List<String> textHintList) {
        Intrinsics.checkNotNullParameter(textInstructions, "textInstructions");
        Intrinsics.checkNotNullParameter(textHintList, "textHintList");
        this.textInstructions = textInstructions;
        this.textHintList = textHintList;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_siteRelease(ElectricInstructionsAndHintsModel self, CompositeEncoder compositeEncoder, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.textInstructions, AnyExtensionKt.empty(StringCompanionObject.INSTANCE))) {
            compositeEncoder.encodeStringElement(serialDesc, 0, self.textInstructions);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.textHintList, CollectionsKt__CollectionsKt.emptyList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.textHintList);
    }

    public /* synthetic */ ElectricInstructionsAndHintsModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final String getTextInstructions() {
        return this.textInstructions;
    }

    @NotNull
    public final List<String> getTextHintList() {
        return this.textHintList;
    }
}
