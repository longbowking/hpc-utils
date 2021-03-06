/**
 *  Copyright 2011 Diego Ceccarelli
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package it.cnr.isti.hpc.io.reader;

/**
 * <strong> DEPRECATED </strong> see RecordReader class
 * @see RecordReader
 * 
 * @author Diego Ceccarelli, diego.ceccarelli@isti.cnr.it created on 25/gen/2012
 */
@Deprecated
public interface ItemReader<T extends Item> extends Iterable<T> {
	
	ItemReader<T> filter(Filter<T> ... filters);
	

}
