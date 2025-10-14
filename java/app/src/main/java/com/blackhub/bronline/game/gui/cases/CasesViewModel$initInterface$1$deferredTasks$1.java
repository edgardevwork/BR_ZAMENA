package com.blackhub.bronline.game.gui.cases;

import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId73;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.tutorial.CommonTutorialTextsWithImage;
import com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesText;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesViewModel.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$initInterface$1$deferredTasks$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes.dex */
public final class CasesViewModel$initInterface$1$deferredTasks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $bgImage;
    public final /* synthetic */ Ref.ObjectRef<CasesBonusHintAttachment> $casesBonusHintAttachment;
    public final /* synthetic */ Ref.ObjectRef<CasesText> $casesStrings;
    public final /* synthetic */ Ref.ObjectRef<Map<String, Bitmap>> $images;
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$initInterface$1$deferredTasks$1(Ref.ObjectRef<Map<String, Bitmap>> objectRef, CasesViewModel casesViewModel, Ref.ObjectRef<Bitmap> objectRef2, Ref.ObjectRef<CasesText> objectRef3, Ref.ObjectRef<CasesBonusHintAttachment> objectRef4, Continuation<? super CasesViewModel$initInterface$1$deferredTasks$1> continuation) {
        super(2, continuation);
        this.$images = objectRef;
        this.this$0 = casesViewModel;
        this.$bgImage = objectRef2;
        this.$casesStrings = objectRef3;
        this.$casesBonusHintAttachment = objectRef4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$initInterface$1$deferredTasks$1(this.$images, this.this$0, this.$bgImage, this.$casesStrings, this.$casesBonusHintAttachment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$initInterface$1$deferredTasks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [T, com.blackhub.bronline.game.gui.cases.model.CasesText] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v21, types: [T, com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{PngConstantsId73.IMG_CASES_HINT_1, PngConstantsId73.IMG_CASES_HINT_2, PngConstantsId73.IMG_CASES_HINT_3, PngConstantsId73.IMG_CASES_HINT_4, PngConstantsId73.IMG_CASES_BONUS_HINT, PngConstantsId73.IMG_LEGENDARY_CASE});
        this.$images.element = BitmapUtilsKt.getBitmapMapFromZip(this.this$0.application, listListOf, ImageTypePathInCDNEnum.IMAGE);
        this.$bgImage.element = BitmapUtilsKt.getBitmapFromZip$default(this.this$0.application, PngConstantsId73.BG_BONUS_CASE, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
        this.$casesStrings.element = new CasesText(StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_hint_sale_one)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_hint_sale_ten)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_hint_unique_case)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_hint_scale_hint)), null, null, CollectionsKt__CollectionsKt.listOf((Object[]) new CommonTutorialTextsWithImage[]{new CommonTutorialTextsWithImage(this.$images.element.get(PngConstantsId73.IMG_CASES_HINT_1), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_title_first)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_text_first_1)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_text_first_2)), null, this.this$0.stringResources.getString(R.string.cases_press_for_next), 16, null), new CommonTutorialTextsWithImage(this.$images.element.get(PngConstantsId73.IMG_CASES_HINT_2), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_title_second)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_text_second_1)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_text_second_2)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_text_second_3)), this.this$0.stringResources.getString(R.string.cases_press_for_next)), new CommonTutorialTextsWithImage(this.$images.element.get(PngConstantsId73.IMG_CASES_HINT_3), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_title_third)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_text_third_1)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_text_third_2)), null, this.this$0.stringResources.getString(R.string.cases_press_for_next), 16, null), new CommonTutorialTextsWithImage(this.$images.element.get(PngConstantsId73.IMG_CASES_HINT_4), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_title_fourth)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_text_fourth_1)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_main_hint_text_fourth_2)), null, this.this$0.stringResources.getString(R.string.cases_press_for_close), 16, null)}), 48, null);
        Ref.ObjectRef<CasesBonusHintAttachment> objectRef = this.$casesBonusHintAttachment;
        Bitmap bitmap = this.$images.element.get(PngConstantsId73.IMG_CASES_BONUS_HINT);
        String upperCase = this.this$0.stringResources.getString(R.string.cases_bonus_hint).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        objectRef.element = new CasesBonusHintAttachment(bitmap, upperCase, StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_bonus_hint_text_1)), this.this$0.stringResources.getString(R.string.cases_bonus_hint_text_2), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_bonus_hint_text_3)), StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_bonus_hint_text_4)));
        return Unit.INSTANCE;
    }
}

