package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ktor.util.AttributeKey;
import io.ktor.websocket.Frame;
import io.ktor.websocket.internals.DeflaterUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebSocketDeflateExtension.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0016\u0010\u001c\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m7105d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension;", "Lio/ktor/websocket/WebSocketExtension;", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "config", "(Lio/ktor/websocket/WebSocketDeflateExtension$Config;)V", "decompressIncoming", "", "deflater", "Ljava/util/zip/Deflater;", "factory", "Lio/ktor/websocket/WebSocketExtensionFactory;", "getFactory", "()Lio/ktor/websocket/WebSocketExtensionFactory;", "incomingNoContextTakeover", "getIncomingNoContextTakeover$ktor_websockets", "()Z", "setIncomingNoContextTakeover$ktor_websockets", "(Z)V", "inflater", "Ljava/util/zip/Inflater;", "outgoingNoContextTakeover", "getOutgoingNoContextTakeover$ktor_websockets", "setOutgoingNoContextTakeover$ktor_websockets", "protocols", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "getProtocols", "()Ljava/util/List;", "clientNegotiation", "negotiatedProtocols", "processIncomingFrame", "Lio/ktor/websocket/Frame;", TypedValues.AttributesType.S_FRAME, "processOutgoingFrame", "serverNegotiation", "requestedProtocols", "Companion", "Config", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketDeflateExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketDeflateExtension.kt\nio/ktor/websocket/WebSocketDeflateExtension\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
/* loaded from: classes8.dex */
public final class WebSocketDeflateExtension implements WebSocketExtension<Config> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<WebSocketDeflateExtension> key = new AttributeKey<>("WebsocketDeflateExtension");
    public static final boolean rsv1 = true;
    public static final boolean rsv2 = false;
    public static final boolean rsv3 = false;

    @NotNull
    public final Config config;
    public boolean decompressIncoming;

    @NotNull
    public final Deflater deflater;

    @NotNull
    public final WebSocketExtensionFactory<Config, ? extends WebSocketExtension<Config>> factory;
    public boolean incomingNoContextTakeover;

    @NotNull
    public final Inflater inflater;
    public boolean outgoingNoContextTakeover;

    @NotNull
    public final List<WebSocketExtensionHeader> protocols;

    public WebSocketDeflateExtension(@NotNull Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.factory = INSTANCE;
        this.protocols = config.build$ktor_websockets();
        this.inflater = new Inflater(true);
        this.deflater = new Deflater(config.getCompressionLevel(), true);
    }

    @Override // io.ktor.websocket.WebSocketExtension
    @NotNull
    public WebSocketExtensionFactory<Config, ? extends WebSocketExtension<Config>> getFactory() {
        return this.factory;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    @NotNull
    public List<WebSocketExtensionHeader> getProtocols() {
        return this.protocols;
    }

    /* renamed from: getOutgoingNoContextTakeover$ktor_websockets, reason: from getter */
    public final boolean getOutgoingNoContextTakeover() {
        return this.outgoingNoContextTakeover;
    }

    public final void setOutgoingNoContextTakeover$ktor_websockets(boolean z) {
        this.outgoingNoContextTakeover = z;
    }

    /* renamed from: getIncomingNoContextTakeover$ktor_websockets, reason: from getter */
    public final boolean getIncomingNoContextTakeover() {
        return this.incomingNoContextTakeover;
    }

    public final void setIncomingNoContextTakeover$ktor_websockets(boolean z) {
        this.incomingNoContextTakeover = z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.ktor.websocket.WebSocketExtension
    public boolean clientNegotiation(@NotNull List<WebSocketExtensionHeader> negotiatedProtocols) {
        Object next;
        Intrinsics.checkNotNullParameter(negotiatedProtocols, "negotiatedProtocols");
        Iterator<T> it = negotiatedProtocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((WebSocketExtensionHeader) next).getName(), WebSocketDeflateExtensionKt.PERMESSAGE_DEFLATE)) {
                break;
            }
        }
        WebSocketExtensionHeader webSocketExtensionHeader = (WebSocketExtensionHeader) next;
        if (webSocketExtensionHeader == null) {
            return false;
        }
        this.incomingNoContextTakeover = this.config.getServerNoContextTakeOver();
        this.outgoingNoContextTakeover = this.config.getClientNoContextTakeOver();
        for (Pair<String, String> pair : webSocketExtensionHeader.parseParameters()) {
            String strComponent1 = pair.component1();
            String strComponent2 = pair.component2();
            switch (strComponent1.hashCode()) {
                case -708713803:
                    if (strComponent1.equals(WebSocketDeflateExtensionKt.CLIENT_NO_CONTEXT_TAKEOVER)) {
                        if (!StringsKt__StringsJVMKt.isBlank(strComponent2)) {
                            throw new IllegalStateException(("WebSocket permessage-deflate extension parameter client_no_context_takeover shouldn't have a value. Current: " + strComponent2).toString());
                        }
                        this.outgoingNoContextTakeover = true;
                        break;
                    } else {
                        continue;
                    }
                case 646404390:
                    if (strComponent1.equals(WebSocketDeflateExtensionKt.CLIENT_MAX_WINDOW_BITS) && !StringsKt__StringsJVMKt.isBlank(strComponent2) && Integer.parseInt(strComponent2) != 15) {
                        throw new IllegalStateException("Only 15 window size is supported.".toString());
                    }
                    break;
                case 1266201133:
                    if (strComponent1.equals(WebSocketDeflateExtensionKt.SERVER_NO_CONTEXT_TAKEOVER)) {
                        if (!StringsKt__StringsJVMKt.isBlank(strComponent2)) {
                            throw new IllegalStateException(("WebSocket permessage-deflate extension parameter server_no_context_takeover shouldn't have a value. Current: " + strComponent2).toString());
                        }
                        this.incomingNoContextTakeover = true;
                        break;
                    } else {
                        continue;
                    }
                case 2034279582:
                    strComponent1.equals(WebSocketDeflateExtensionKt.SERVER_MAX_WINDOW_BITS);
                    break;
            }
        }
        return true;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    @NotNull
    public List<WebSocketExtensionHeader> serverNegotiation(@NotNull List<WebSocketExtensionHeader> requestedProtocols) {
        Object next;
        Intrinsics.checkNotNullParameter(requestedProtocols, "requestedProtocols");
        Iterator<T> it = requestedProtocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((WebSocketExtensionHeader) next).getName(), WebSocketDeflateExtensionKt.PERMESSAGE_DEFLATE)) {
                break;
            }
        }
        WebSocketExtensionHeader webSocketExtensionHeader = (WebSocketExtensionHeader) next;
        if (webSocketExtensionHeader == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, String> pair : webSocketExtensionHeader.parseParameters()) {
            String strComponent1 = pair.component1();
            String strComponent2 = pair.component2();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = strComponent1.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            switch (lowerCase.hashCode()) {
                case -708713803:
                    if (lowerCase.equals(WebSocketDeflateExtensionKt.CLIENT_NO_CONTEXT_TAKEOVER)) {
                        if (!StringsKt__StringsJVMKt.isBlank(strComponent2)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        this.incomingNoContextTakeover = true;
                        arrayList.add(WebSocketDeflateExtensionKt.CLIENT_NO_CONTEXT_TAKEOVER);
                    } else {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + strComponent1 + ", " + strComponent2 + ')').toString());
                    }
                case 646404390:
                    if (!lowerCase.equals(WebSocketDeflateExtensionKt.CLIENT_MAX_WINDOW_BITS)) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + strComponent1 + ", " + strComponent2 + ')').toString());
                    }
                case 1266201133:
                    if (lowerCase.equals(WebSocketDeflateExtensionKt.SERVER_NO_CONTEXT_TAKEOVER)) {
                        if (!StringsKt__StringsJVMKt.isBlank(strComponent2)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        this.outgoingNoContextTakeover = true;
                        arrayList.add(WebSocketDeflateExtensionKt.SERVER_NO_CONTEXT_TAKEOVER);
                    } else {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + strComponent1 + ", " + strComponent2 + ')').toString());
                    }
                case 2034279582:
                    if (lowerCase.equals(WebSocketDeflateExtensionKt.SERVER_MAX_WINDOW_BITS)) {
                        if (Integer.parseInt(strComponent2) != 15) {
                            throw new IllegalStateException("Only 15 window size is supported".toString());
                        }
                    } else {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + strComponent1 + ", " + strComponent2 + ')').toString());
                    }
                default:
                    throw new IllegalStateException(("Unsupported extension parameter: (" + strComponent1 + ", " + strComponent2 + ')').toString());
            }
        }
        return CollectionsKt__CollectionsJVMKt.listOf(new WebSocketExtensionHeader(WebSocketDeflateExtensionKt.PERMESSAGE_DEFLATE, arrayList));
    }

    @Override // io.ktor.websocket.WebSocketExtension
    @NotNull
    public Frame processOutgoingFrame(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if ((!(frame instanceof Frame.Text) && !(frame instanceof Frame.Binary)) || !this.config.getCompressCondition$ktor_websockets().invoke(frame).booleanValue()) {
            return frame;
        }
        byte[] bArrDeflateFully = DeflaterUtilsKt.deflateFully(this.deflater, frame.getData());
        if (this.outgoingNoContextTakeover) {
            this.deflater.reset();
        }
        return Frame.INSTANCE.byType(frame.getFin(), frame.getFrameType(), bArrDeflateFully, rsv1, frame.getRsv2(), frame.getRsv3());
    }

    @Override // io.ktor.websocket.WebSocketExtension
    @NotNull
    public Frame processIncomingFrame(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (!WebSocketDeflateExtensionKt.isCompressed(frame) && !this.decompressIncoming) {
            return frame;
        }
        this.decompressIncoming = true;
        byte[] bArrInflateFully = DeflaterUtilsKt.inflateFully(this.inflater, frame.getData());
        if (this.incomingNoContextTakeover) {
            this.inflater.reset();
        }
        if (frame.getFin()) {
            this.decompressIncoming = false;
        }
        return Frame.INSTANCE.byType(frame.getFin(), frame.getFrameType(), bArrInflateFully, !rsv1, frame.getRsv2(), frame.getRsv3());
    }

    /* compiled from: WebSocketDeflateExtension.kt */
    @Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 H\u0000¢\u0006\u0002\b!J)\u0010\"\u001a\u00020\u00192!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00040\nJ\u000e\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0011J/\u0010)\u001a\u00020\u00192'\u0010#\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00190\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R,\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00190\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b¨\u0006+"}, m7105d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "", "()V", "clientNoContextTakeOver", "", "getClientNoContextTakeOver", "()Z", "setClientNoContextTakeOver", "(Z)V", "compressCondition", "Lkotlin/Function1;", "Lio/ktor/websocket/Frame;", "getCompressCondition$ktor_websockets", "()Lkotlin/jvm/functions/Function1;", "setCompressCondition$ktor_websockets", "(Lkotlin/jvm/functions/Function1;)V", "compressionLevel", "", "getCompressionLevel", "()I", "setCompressionLevel", "(I)V", "manualConfig", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "", "getManualConfig$ktor_websockets", "setManualConfig$ktor_websockets", "serverNoContextTakeOver", "getServerNoContextTakeOver", "setServerNoContextTakeOver", "build", "", "build$ktor_websockets", "compressIf", "block", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_FRAME, "compressIfBiggerThan", "bytes", "configureProtocols", "protocols", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class Config {
        public boolean clientNoContextTakeOver;
        public boolean serverNoContextTakeOver;
        public int compressionLevel = -1;

        @NotNull
        public Function1<? super List<WebSocketExtensionHeader>, Unit> manualConfig = new Function1<List<WebSocketExtensionHeader>, Unit>() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$manualConfig$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<WebSocketExtensionHeader> it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<WebSocketExtensionHeader> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }
        };

        @NotNull
        public Function1<? super Frame, Boolean> compressCondition = new Function1<Frame, Boolean>() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$compressCondition$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Frame it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        };

        public final boolean getClientNoContextTakeOver() {
            return this.clientNoContextTakeOver;
        }

        public final void setClientNoContextTakeOver(boolean z) {
            this.clientNoContextTakeOver = z;
        }

        public final boolean getServerNoContextTakeOver() {
            return this.serverNoContextTakeOver;
        }

        public final void setServerNoContextTakeOver(boolean z) {
            this.serverNoContextTakeOver = z;
        }

        public final int getCompressionLevel() {
            return this.compressionLevel;
        }

        public final void setCompressionLevel(int i) {
            this.compressionLevel = i;
        }

        @NotNull
        public final Function1<List<WebSocketExtensionHeader>, Unit> getManualConfig$ktor_websockets() {
            return this.manualConfig;
        }

        public final void setManualConfig$ktor_websockets(@NotNull Function1<? super List<WebSocketExtensionHeader>, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.manualConfig = function1;
        }

        @NotNull
        public final Function1<Frame, Boolean> getCompressCondition$ktor_websockets() {
            return this.compressCondition;
        }

        public final void setCompressCondition$ktor_websockets(@NotNull Function1<? super Frame, Boolean> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.compressCondition = function1;
        }

        public final void configureProtocols(@NotNull final Function1<? super List<WebSocketExtensionHeader>, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            final Function1<? super List<WebSocketExtensionHeader>, Unit> function1 = this.manualConfig;
            this.manualConfig = new Function1<List<WebSocketExtensionHeader>, Unit>() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$configureProtocols$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<WebSocketExtensionHeader> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull List<WebSocketExtensionHeader> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    function1.invoke(it);
                    block.invoke(it);
                }
            };
        }

        public final void compressIf(@NotNull final Function1<? super Frame, Boolean> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            final Function1<? super Frame, Boolean> function1 = this.compressCondition;
            this.compressCondition = new Function1<Frame, Boolean>() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$compressIf$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull Frame it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(block.invoke(it).booleanValue() && function1.invoke(it).booleanValue());
                }
            };
        }

        public final void compressIfBiggerThan(final int bytes) {
            compressIf(new Function1<Frame, Boolean>() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$compressIfBiggerThan$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull Frame frame) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                    return Boolean.valueOf(frame.getData().length > bytes);
                }
            });
        }

        @NotNull
        public final List<WebSocketExtensionHeader> build$ktor_websockets() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.clientNoContextTakeOver) {
                arrayList2.add(WebSocketDeflateExtensionKt.CLIENT_NO_CONTEXT_TAKEOVER);
            }
            if (this.serverNoContextTakeOver) {
                arrayList2.add(WebSocketDeflateExtensionKt.SERVER_NO_CONTEXT_TAKEOVER);
            }
            arrayList.add(new WebSocketExtensionHeader(WebSocketDeflateExtensionKt.PERMESSAGE_DEFLATE, arrayList2));
            this.manualConfig.invoke(arrayList);
            return arrayList;
        }
    }

    /* compiled from: WebSocketDeflateExtension.kt */
    @Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J!\u0010\u0011\u001a\u00020\u00032\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0016"}, m7105d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension$Companion;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "Lio/ktor/websocket/WebSocketDeflateExtension;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "rsv1", "", "getRsv1", "()Z", "rsv2", "getRsv2", "rsv3", "getRsv3", "install", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion implements WebSocketExtensionFactory<Config, WebSocketDeflateExtension> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        @NotNull
        public AttributeKey<WebSocketDeflateExtension> getKey() {
            return WebSocketDeflateExtension.key;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv1() {
            return WebSocketDeflateExtension.rsv1;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv2() {
            return WebSocketDeflateExtension.rsv2;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv3() {
            return WebSocketDeflateExtension.rsv3;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.websocket.WebSocketExtensionFactory
        @NotNull
        public WebSocketDeflateExtension install(@NotNull Function1<? super Config, Unit> config) {
            Intrinsics.checkNotNullParameter(config, "config");
            Config config2 = new Config();
            config.invoke(config2);
            return new WebSocketDeflateExtension(config2);
        }
    }
}
