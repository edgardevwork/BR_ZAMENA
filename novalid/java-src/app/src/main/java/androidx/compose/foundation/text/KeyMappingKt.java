package androidx.compose.foundation.text;

import androidx.compose.p003ui.input.key.Key;
import androidx.compose.p003ui.input.key.KeyEvent;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KeyMapping.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m7105d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class KeyMappingKt {

    @NotNull
    private static final KeyMapping defaultKeyMapping;

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo8420mapZmokQxo(@NotNull android.view.KeyEvent event) {
                if (function1.invoke(KeyEvent.m12331boximpl(event)).booleanValue() && KeyEvent_androidKt.m12354isShiftPressedZmokQxo(event)) {
                    if (Key.m12040equalsimpl0(KeyEvent_androidKt.m12348getKeyZmokQxo(event), MappedKeys.INSTANCE.m8457getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m12331boximpl(event)).booleanValue()) {
                    long jM12348getKeyZmokQxo = KeyEvent_androidKt.m12348getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8437getCEK5gGoQ()) ? true : Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8447getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8454getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8455getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8434getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8456getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8457getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m12352isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m12354isShiftPressedZmokQxo(event)) {
                    long jM12348getKeyZmokQxo2 = KeyEvent_androidKt.m12348getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8442getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8443getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8444getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8441getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8451getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8450getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8449getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8448getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8447getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM12348getKeyZmokQxo3 = KeyEvent_androidKt.m12348getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8442getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8443getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8444getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8441getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8451getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8450getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8449getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8448getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8445getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8436getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8440getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8452getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8439getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8438getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8453getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m12352isCtrlPressedZmokQxo(((KeyEvent) obj).m12337unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo8420mapZmokQxo(@NotNull android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m12354isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m12352isCtrlPressedZmokQxo(event)) {
                    long jM12348getKeyZmokQxo = KeyEvent_androidKt.m12348getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8442getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8443getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8444getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8441getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m12352isCtrlPressedZmokQxo(event)) {
                    long jM12348getKeyZmokQxo2 = KeyEvent_androidKt.m12348getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8442getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8443getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8444getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8441getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8446getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8440getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8436getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8435getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m12354isShiftPressedZmokQxo(event)) {
                    long jM12348getKeyZmokQxo3 = KeyEvent_androidKt.m12348getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8449getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo3, mappedKeys3.m8448getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m12351isAltPressedZmokQxo(event)) {
                    long jM12348getKeyZmokQxo4 = KeyEvent_androidKt.m12348getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo4, mappedKeys4.m8436getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo4, mappedKeys4.m8440getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo8420mapZmokQxo(event) : keyCommand;
            }
        };
    }
}
