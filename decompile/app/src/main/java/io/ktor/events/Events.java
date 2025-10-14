package io.ktor.events;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.util.collections.CopyOnWriteHashMap;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;

/* compiled from: Events.kt */
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u00052\u0006\u0010\f\u001a\u0002H\n¢\u0006\u0002\u0010\rJ8\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u00052\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\t0\u0011j\b\u0012\u0004\u0012\u0002H\n`\u0012J8\u0010\u0013\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u00052\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\t0\u0011j\b\u0012\u0004\u0012\u0002H\n`\u0012R$\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002¨\u0006\u0015"}, m7105d2 = {"Lio/ktor/events/Events;", "", "()V", "handlers", "Lio/ktor/util/collections/CopyOnWriteHashMap;", "Lio/ktor/events/EventDefinition;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getHandlers$annotations", "raise", "", ExifInterface.GPS_DIRECTION_TRUE, "definition", "value", "(Lio/ktor/events/EventDefinition;Ljava/lang/Object;)V", "subscribe", "Lkotlinx/coroutines/DisposableHandle;", "handler", "Lkotlin/Function1;", "Lio/ktor/events/EventHandler;", "unsubscribe", "HandlerRegistration", "ktor-events"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEvents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Events.kt\nio/ktor/events/Events\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n341#2,6:94\n341#2,3:100\n344#2,3:104\n1#3:103\n*S KotlinDebug\n*F\n+ 1 Events.kt\nio/ktor/events/Events\n*L\n33#1:94,6\n46#1:100,3\n46#1:104,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Events {

    @NotNull
    public final CopyOnWriteHashMap<EventDefinition<?>, LockFreeLinkedListHead> handlers = new CopyOnWriteHashMap<>();

    public static /* synthetic */ void getHandlers$annotations() {
    }

    @NotNull
    public final <T> DisposableHandle subscribe(@NotNull EventDefinition<T> definition, @NotNull Function1<? super T, Unit> handler) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(handler, "handler");
        HandlerRegistration handlerRegistration = new HandlerRegistration(handler);
        this.handlers.computeIfAbsent(definition, new Function1<EventDefinition<?>, LockFreeLinkedListHead>() { // from class: io.ktor.events.Events.subscribe.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final LockFreeLinkedListHead invoke(@NotNull EventDefinition<?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new LockFreeLinkedListHead();
            }
        }).addLast(handlerRegistration);
        return handlerRegistration;
    }

    public final <T> void unsubscribe(@NotNull EventDefinition<T> definition, @NotNull Function1<? super T, Unit> handler) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(handler, "handler");
        LockFreeLinkedListHead lockFreeLinkedListHead = this.handlers.get(definition);
        if (lockFreeLinkedListHead != null) {
            Object next = lockFreeLinkedListHead.getNext();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !Intrinsics.areEqual(nextNode, lockFreeLinkedListHead); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof HandlerRegistration) {
                    HandlerRegistration handlerRegistration = (HandlerRegistration) nextNode;
                    if (Intrinsics.areEqual(handlerRegistration.getHandler(), handler)) {
                        handlerRegistration.mo17256remove();
                    }
                }
            }
        }
    }

    public final <T> void raise(@NotNull EventDefinition<T> definition, T value) {
        Unit unit;
        Intrinsics.checkNotNullParameter(definition, "definition");
        LockFreeLinkedListHead lockFreeLinkedListHead = this.handlers.get(definition);
        Throwable th = null;
        if (lockFreeLinkedListHead != null) {
            Object next = lockFreeLinkedListHead.getNext();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            Throwable th2 = null;
            for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !Intrinsics.areEqual(nextNode, lockFreeLinkedListHead); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof HandlerRegistration) {
                    try {
                        Function1<?, Unit> handler = ((HandlerRegistration) nextNode).getHandler();
                        Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise$lambda$2, kotlin.Unit>{ io.ktor.events.EventsKt.EventHandler<T of io.ktor.events.Events.raise$lambda$2> }");
                        ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(handler, 1)).invoke(value);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            ExceptionsKt__ExceptionsKt.addSuppressed(th2, th3);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            th2 = th3;
                        }
                    }
                }
            }
            th = th2;
        }
        if (th != null) {
            throw th;
        }
    }

    /* compiled from: Events.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u0004j\u0006\u0012\u0002\b\u0003`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0005H\u0016R#\u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u0004j\u0006\u0012\u0002\b\u0003`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m7105d2 = {"Lio/ktor/events/Events$HandlerRegistration;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "handler", "Lkotlin/Function1;", "", "Lio/ktor/events/EventHandler;", "(Lkotlin/jvm/functions/Function1;)V", "getHandler", "()Lkotlin/jvm/functions/Function1;", "dispose", "ktor-events"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class HandlerRegistration extends LockFreeLinkedListNode implements DisposableHandle {

        @NotNull
        public final Function1<?, Unit> handler;

        public HandlerRegistration(@NotNull Function1<?, Unit> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.handler = handler;
        }

        @NotNull
        public final Function1<?, Unit> getHandler() {
            return this.handler;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            mo17256remove();
        }
    }
}
