package io.ktor.client.plugins;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedCallKt;
import io.ktor.client.plugins.HttpCallValidator;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.utils.p050io.charsets.MalformedInputException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

/* compiled from: DefaultResponseValidation.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"BODY_FAILED_DECODING", "", "DEPRECATED_EXCEPTION_CTOR", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "NO_RESPONSE_TEXT", "ValidateMark", "Lio/ktor/util/AttributeKey;", "", "addDefaultResponseValidation", "Lio/ktor/client/HttpClientConfig;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DefaultResponseValidationKt {

    @NotNull
    public static final String BODY_FAILED_DECODING = "<body failed decoding>";

    @NotNull
    public static final String DEPRECATED_EXCEPTION_CTOR = "Please, provide response text in constructor";

    @NotNull
    public static final String NO_RESPONSE_TEXT = "<no response text provided>";

    @NotNull
    public static final AttributeKey<Unit> ValidateMark = new AttributeKey<>("ValidateMark");

    @NotNull
    public static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultResponseValidation");

    public static final void addDefaultResponseValidation(@NotNull final HttpClientConfig<?> httpClientConfig) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        HttpCallValidatorKt.HttpResponseValidator(httpClientConfig, new Function1<HttpCallValidator.Config, Unit>() { // from class: io.ktor.client.plugins.DefaultResponseValidationKt.addDefaultResponseValidation.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpCallValidator.Config config) {
                invoke2(config);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull HttpCallValidator.Config HttpResponseValidator) {
                Intrinsics.checkNotNullParameter(HttpResponseValidator, "$this$HttpResponseValidator");
                HttpResponseValidator.setExpectSuccess(httpClientConfig.getExpectSuccess());
                HttpResponseValidator.validateResponse(new AnonymousClass1(null));
            }

            /* compiled from: DefaultResponseValidation.kt */
            @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "response", "Lio/ktor/client/statement/HttpResponse;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", m7120f = "DefaultResponseValidation.kt", m7121i = {0, 0, 1, 1, 1}, m7122l = {42, 48}, m7123m = "invokeSuspend", m7124n = {"response", "statusCode", "response", "exceptionResponse", "statusCode"}, m7125s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
            /* renamed from: io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1, reason: invalid class name */
            /* loaded from: classes7.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Unit>, Object> {
                public int I$0;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public int label;

                public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull HttpResponse httpResponse, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(httpResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(8:6|54|7|30|34|(2:39|(1:(1:48)(1:47))(1:43))(1:38)|49|50)(2:9|10))(1:11))(2:12|(2:14|15)(2:16|(2:51|52)(2:21|(1:23)(1:24))))|25|56|26|(1:28)(6:29|30|34|(2:39|(1:(2:45|48)(0))(0))(0)|49|50)|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
                
                    r0 = r1;
                    r3 = r5;
                    r1 = r11;
                 */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    int value;
                    HttpResponse httpResponse;
                    int i;
                    HttpResponse httpResponse2;
                    HttpResponse httpResponse3;
                    String str;
                    Throwable responseException;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        HttpResponse httpResponse4 = (HttpResponse) this.L$0;
                        if (!((Boolean) httpResponse4.getCall().getAttributes().get(HttpCallValidatorKt.getExpectSuccessAttributeKey())).booleanValue()) {
                            DefaultResponseValidationKt.LOGGER.trace("Skipping default response validation for " + httpResponse4.getCall().getRequest().getUrl());
                            return Unit.INSTANCE;
                        }
                        value = httpResponse4.getStatus().getValue();
                        HttpClientCall call = httpResponse4.getCall();
                        if (value < 300 || call.getAttributes().contains(DefaultResponseValidationKt.ValidateMark)) {
                            return Unit.INSTANCE;
                        }
                        this.L$0 = httpResponse4;
                        this.I$0 = value;
                        this.label = 1;
                        Object objSave = SavedCallKt.save(call, this);
                        if (objSave == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        httpResponse = httpResponse4;
                        obj = objSave;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i = this.I$0;
                            httpResponse3 = (HttpResponse) this.L$1;
                            httpResponse2 = (HttpResponse) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                str = (String) obj;
                            } catch (MalformedInputException unused) {
                                str = DefaultResponseValidationKt.BODY_FAILED_DECODING;
                                if (300 > i) {
                                }
                                DefaultResponseValidationKt.LOGGER.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + responseException);
                                throw responseException;
                            }
                            if (300 > i && i < 400) {
                                responseException = new RedirectResponseException(httpResponse3, str);
                            } else if (400 > i && i < 500) {
                                responseException = new ClientRequestException(httpResponse3, str);
                            } else if (500 > i && i < 600) {
                                responseException = new ServerResponseException(httpResponse3, str);
                            } else {
                                responseException = new ResponseException(httpResponse3, str);
                            }
                            DefaultResponseValidationKt.LOGGER.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + responseException);
                            throw responseException;
                        }
                        value = this.I$0;
                        httpResponse = (HttpResponse) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    HttpClientCall httpClientCall = (HttpClientCall) obj;
                    httpClientCall.getAttributes().put(DefaultResponseValidationKt.ValidateMark, Unit.INSTANCE);
                    HttpResponse response = httpClientCall.getResponse();
                    this.L$0 = httpResponse;
                    this.L$1 = response;
                    this.I$0 = value;
                    this.label = 2;
                    Object objBodyAsText$default = HttpResponseKt.bodyAsText$default(response, null, this, 1, null);
                    if (objBodyAsText$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = value;
                    httpResponse3 = response;
                    obj = objBodyAsText$default;
                    httpResponse2 = httpResponse;
                    str = (String) obj;
                    if (300 > i) {
                        if (400 > i) {
                            if (500 > i) {
                                responseException = new ResponseException(httpResponse3, str);
                            }
                        }
                    }
                    DefaultResponseValidationKt.LOGGER.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + responseException);
                    throw responseException;
                }
            }
        });
    }
}
