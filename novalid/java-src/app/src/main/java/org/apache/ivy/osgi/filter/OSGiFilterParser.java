package org.apache.ivy.osgi.filter;

import java.text.ParseException;
import org.apache.ivy.osgi.filter.CompareFilter;

/* loaded from: classes5.dex */
public class OSGiFilterParser {
    public static OSGiFilter parse(String str) throws ParseException {
        return new Parser(str).parse();
    }

    public static class Parser {

        /* renamed from: c */
        public char f9974c;
        public int length;
        public int pos = 0;
        public final String text;

        public final boolean isOperator(char c) {
            return c == '=' || c == '<' || c == '>' || c == '~';
        }

        public Parser(String str) {
            this.text = str;
            this.length = str.length();
        }

        public OSGiFilter parse() throws ParseException {
            return parseFilter();
        }

        public final char readNext() {
            int i = this.pos;
            if (i == this.length) {
                this.f9974c = (char) 0;
            } else {
                String str = this.text;
                this.pos = i + 1;
                this.f9974c = str.charAt(i);
            }
            return this.f9974c;
        }

        public final void unread() {
            int i = this.pos;
            if (i > 0) {
                this.pos = i - 1;
            }
        }

        public final OSGiFilter parseFilter() throws ParseException {
            skipWhiteSpace();
            readNext();
            if (this.f9974c != '(') {
                throw new ParseException("Expecting '(' as the start of the filter", this.pos);
            }
            OSGiFilter filterComp = parseFilterComp();
            readNext();
            if (this.f9974c == ')') {
                return filterComp;
            }
            throw new ParseException("Expecting ')' as the end of the filter", this.pos);
        }

        public final OSGiFilter parseFilterComp() throws ParseException {
            char next = readNext();
            if (next == '!') {
                return parseNot();
            }
            if (next == '&') {
                return parseAnd();
            }
            if (next == '|') {
                return parseOr();
            }
            unread();
            return parseOperation();
        }

        public final OSGiFilter parseOperation() throws ParseException {
            return new CompareFilter(parseCompareValue(), parseCompareOperator(), parseCompareValue());
        }

        public final String parseCompareValue() {
            char c;
            StringBuilder sb = new StringBuilder();
            do {
                readNext();
                if (!isOperator(this.f9974c) && (c = this.f9974c) != ')' && c != '(') {
                    sb.append(c);
                } else {
                    unread();
                    break;
                }
            } while (this.pos < this.length);
            return sb.toString();
        }

        public final CompareFilter.Operator parseCompareOperator() throws ParseException {
            char next = readNext();
            if (next != '~') {
                switch (next) {
                    case '<':
                        if (readNext() == '=') {
                            return CompareFilter.Operator.LOWER_OR_EQUAL;
                        }
                        unread();
                        return CompareFilter.Operator.LOWER_THAN;
                    case '=':
                        if (readNext() == '*') {
                            return CompareFilter.Operator.PRESENT;
                        }
                        unread();
                        return CompareFilter.Operator.EQUALS;
                    case '>':
                        if (readNext() == '=') {
                            return CompareFilter.Operator.GREATER_OR_EQUAL;
                        }
                        unread();
                        return CompareFilter.Operator.GREATER_THAN;
                }
            }
            if (readNext() == '=') {
                return CompareFilter.Operator.LOWER_OR_EQUAL;
            }
            unread();
            throw new ParseException("Expecting an operator: =, <, <=, >, >=, ~= or =*", this.pos);
        }

        public final OSGiFilter parseAnd() throws ParseException {
            AndFilter andFilter = new AndFilter();
            parseFilterList(andFilter);
            return andFilter;
        }

        public final OSGiFilter parseOr() throws ParseException {
            OrFilter orFilter = new OrFilter();
            parseFilterList(orFilter);
            return orFilter;
        }

        public final void parseFilterList(MultiOperatorFilter multiOperatorFilter) throws ParseException {
            while (true) {
                skipWhiteSpace();
                readNext();
                if (this.f9974c == '(') {
                    unread();
                    multiOperatorFilter.add(parseFilter());
                    if (this.pos >= this.length) {
                        break;
                    }
                } else {
                    unread();
                    break;
                }
            }
            if (multiOperatorFilter.getSubFilters().size() == 0) {
                throw new ParseException("Expecting at least one sub filter", this.pos);
            }
        }

        public final OSGiFilter parseNot() throws ParseException {
            readNext();
            if (this.f9974c != '(') {
                throw new ParseException("The ! operator is expecting a filter", this.pos);
            }
            unread();
            return new NotFilter(parseFilter());
        }

        public final void skipWhiteSpace() {
            while (readNext() == ' ') {
                if (this.pos >= this.length) {
                    return;
                }
            }
            unread();
        }
    }
}
