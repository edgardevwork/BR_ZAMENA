package com.google.common.p024io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes7.dex */
public abstract class CharSource {
    public abstract Reader openStream() throws IOException;

    public ByteSource asByteSource(Charset charset) {
        return new AsByteSource(charset);
    }

    public BufferedReader openBufferedStream() throws IOException {
        Reader readerOpenStream = openStream();
        if (readerOpenStream instanceof BufferedReader) {
            return (BufferedReader) readerOpenStream;
        }
        return new BufferedReader(readerOpenStream);
    }

    public Optional<Long> lengthIfKnown() {
        return Optional.absent();
    }

    public long length() throws Throwable {
        Optional<Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue();
        }
        try {
            return countBySkipping((Reader) Closer.create().register(openStream()));
        } finally {
        }
    }

    public final long countBySkipping(Reader reader) throws IOException {
        long j = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j;
            }
            j += jSkip;
        }
    }

    @CanIgnoreReturnValue
    public long copyTo(Appendable appendable) throws Throwable {
        Preconditions.checkNotNull(appendable);
        try {
            return CharStreams.copy((Reader) Closer.create().register(openStream()), appendable);
        } finally {
        }
    }

    @CanIgnoreReturnValue
    public long copyTo(CharSink sink) throws Throwable {
        Preconditions.checkNotNull(sink);
        Closer closerCreate = Closer.create();
        try {
            return CharStreams.copy((Reader) closerCreate.register(openStream()), (Writer) closerCreate.register(sink.openStream()));
        } finally {
        }
    }

    public String read() throws Throwable {
        try {
            return CharStreams.toString((Reader) Closer.create().register(openStream()));
        } finally {
        }
    }

    @CheckForNull
    public String readFirstLine() throws Throwable {
        try {
            return ((BufferedReader) Closer.create().register(openBufferedStream())).readLine();
        } finally {
        }
    }

    public ImmutableList<String> readLines() throws Throwable {
        try {
            BufferedReader bufferedReader = (BufferedReader) Closer.create().register(openBufferedStream());
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    arrayListNewArrayList.add(line);
                } else {
                    return ImmutableList.copyOf((Collection) arrayListNewArrayList);
                }
            }
        } finally {
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T readLines(LineProcessor<T> lineProcessor) throws Throwable {
        Preconditions.checkNotNull(lineProcessor);
        try {
            return (T) CharStreams.readLines((Reader) Closer.create().register(openStream()), lineProcessor);
        } finally {
        }
    }

    public boolean isEmpty() throws Throwable {
        Optional<Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue() == 0;
        }
        Closer closerCreate = Closer.create();
        try {
            return ((Reader) closerCreate.register(openStream())).read() == -1;
        } catch (Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } finally {
                closerCreate.close();
            }
        }
    }

    public static CharSource concat(Iterable<? extends CharSource> sources) {
        return new ConcatenatedCharSource(sources);
    }

    public static CharSource concat(Iterator<? extends CharSource> sources) {
        return concat(ImmutableList.copyOf(sources));
    }

    public static CharSource concat(CharSource... sources) {
        return concat(ImmutableList.copyOf(sources));
    }

    public static CharSource wrap(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return new StringCharSource((String) charSequence);
        }
        return new CharSequenceCharSource(charSequence);
    }

    public static CharSource empty() {
        return EmptyCharSource.INSTANCE;
    }

    /* loaded from: classes6.dex */
    public final class AsByteSource extends ByteSource {
        public final Charset charset;

        public AsByteSource(Charset charset) {
            this.charset = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.p024io.ByteSource
        public CharSource asCharSource(Charset charset) {
            if (charset.equals(this.charset)) {
                return CharSource.this;
            }
            return super.asCharSource(charset);
        }

        @Override // com.google.common.p024io.ByteSource
        public InputStream openStream() throws IOException {
            return new ReaderInputStream(CharSource.this.openStream(), this.charset, 8192);
        }

        public String toString() {
            return CharSource.this.toString() + ".asByteSource(" + this.charset + ")";
        }
    }

    /* loaded from: classes6.dex */
    public static class CharSequenceCharSource extends CharSource {
        public static final Splitter LINE_SPLITTER = Splitter.onPattern("\r\n|\n|\r");
        public final CharSequence seq;

        public CharSequenceCharSource(CharSequence seq) {
            this.seq = (CharSequence) Preconditions.checkNotNull(seq);
        }

        @Override // com.google.common.p024io.CharSource
        public Reader openStream() {
            return new CharSequenceReader(this.seq);
        }

        @Override // com.google.common.p024io.CharSource
        public String read() {
            return this.seq.toString();
        }

        @Override // com.google.common.p024io.CharSource
        public boolean isEmpty() {
            return this.seq.length() == 0;
        }

        @Override // com.google.common.p024io.CharSource
        public long length() {
            return this.seq.length();
        }

        @Override // com.google.common.p024io.CharSource
        public Optional<Long> lengthIfKnown() {
            return Optional.m1145of(Long.valueOf(this.seq.length()));
        }

        public final Iterator<String> linesIterator() {
            return new AbstractIterator<String>() { // from class: com.google.common.io.CharSource.CharSequenceCharSource.1
                public Iterator<String> lines;

                {
                    this.lines = CharSequenceCharSource.LINE_SPLITTER.split(CharSequenceCharSource.this.seq).iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public String computeNext() {
                    if (this.lines.hasNext()) {
                        String next = this.lines.next();
                        if (this.lines.hasNext() || !next.isEmpty()) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // com.google.common.p024io.CharSource
        @CheckForNull
        public String readFirstLine() {
            Iterator<String> itLinesIterator = linesIterator();
            if (itLinesIterator.hasNext()) {
                return itLinesIterator.next();
            }
            return null;
        }

        @Override // com.google.common.p024io.CharSource
        public ImmutableList<String> readLines() {
            return ImmutableList.copyOf(linesIterator());
        }

        @Override // com.google.common.p024io.CharSource
        @ParametricNullness
        public <T> T readLines(LineProcessor<T> processor) throws IOException {
            Iterator<String> itLinesIterator = linesIterator();
            while (itLinesIterator.hasNext() && processor.processLine(itLinesIterator.next())) {
            }
            return processor.getResult();
        }

        public String toString() {
            return "CharSource.wrap(" + Ascii.truncate(this.seq, 30, "...") + ")";
        }
    }

    /* loaded from: classes5.dex */
    public static class StringCharSource extends CharSequenceCharSource {
        public StringCharSource(String seq) {
            super(seq);
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource, com.google.common.p024io.CharSource
        public Reader openStream() {
            return new StringReader((String) this.seq);
        }

        @Override // com.google.common.p024io.CharSource
        public long copyTo(Appendable appendable) throws IOException {
            appendable.append(this.seq);
            return this.seq.length();
        }

        @Override // com.google.common.p024io.CharSource
        public long copyTo(CharSink sink) throws Throwable {
            Preconditions.checkNotNull(sink);
            try {
                ((Writer) Closer.create().register(sink.openStream())).write((String) this.seq);
                return this.seq.length();
            } finally {
            }
        }
    }

    public static final class EmptyCharSource extends StringCharSource {
        public static final EmptyCharSource INSTANCE = new EmptyCharSource();

        public EmptyCharSource() {
            super("");
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public String toString() {
            return "CharSource.empty()";
        }
    }

    /* loaded from: classes6.dex */
    public static final class ConcatenatedCharSource extends CharSource {
        public final Iterable<? extends CharSource> sources;

        public ConcatenatedCharSource(Iterable<? extends CharSource> sources) {
            this.sources = (Iterable) Preconditions.checkNotNull(sources);
        }

        @Override // com.google.common.p024io.CharSource
        public Reader openStream() throws IOException {
            return new MultiReader(this.sources.iterator());
        }

        @Override // com.google.common.p024io.CharSource
        public boolean isEmpty() throws IOException {
            Iterator<? extends CharSource> it = this.sources.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p024io.CharSource
        public Optional<Long> lengthIfKnown() {
            Iterator<? extends CharSource> it = this.sources.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Optional<Long> optionalLengthIfKnown = it.next().lengthIfKnown();
                if (!optionalLengthIfKnown.isPresent()) {
                    return Optional.absent();
                }
                jLongValue += optionalLengthIfKnown.get().longValue();
            }
            return Optional.m1145of(Long.valueOf(jLongValue));
        }

        @Override // com.google.common.p024io.CharSource
        public long length() throws IOException {
            Iterator<? extends CharSource> it = this.sources.iterator();
            long length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length;
        }

        public String toString() {
            return "CharSource.concat(" + this.sources + ")";
        }
    }
}
