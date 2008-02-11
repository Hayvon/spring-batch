/*
 * Copyright 2006-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.batch.io.exception;

import org.springframework.batch.item.ItemWriter;

/**
 * Exception thrown after encountering an error during a write.  It should
 * generally be thrown by classes that implement the {@link ItemWriter} 
 * interface.
 * 
 *  @author Lucas Ward
 */
public class WriteFailureException extends BatchCriticalException {
	private static final long serialVersionUID = -1933213086873834098L;

	public WriteFailureException(String msg, Throwable ex) {
		super(msg, ex);
	}

	public WriteFailureException(String msg) {
		super(msg);
	}

	public WriteFailureException(Throwable nested) {
		super(nested);
	}
}
