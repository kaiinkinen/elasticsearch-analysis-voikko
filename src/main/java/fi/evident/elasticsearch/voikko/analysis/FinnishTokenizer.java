/*
 * Copyright 2014-2017 Evident Solutions Oy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fi.evident.elasticsearch.voikko.analysis;

import org.apache.lucene.analysis.util.CharTokenizer;

/**
 * A tokenizer that tries to break text into tokens based on rules of Finnish language.
 * This is almost same as {@link org.apache.lucene.analysis.core.LetterTokenizer}, but
 * treats hyphen as a letter as well, since hyphens can be part of words. (e.g. "rippi-isä").
 */
public class FinnishTokenizer extends CharTokenizer {

    @Override
    protected boolean isTokenChar(int c) {
        return Character.isLetterOrDigit(c) || c == '-';
    }
}
