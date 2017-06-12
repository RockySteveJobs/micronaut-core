package org.particleframework.core.convert;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

/**
 * A type converter for converting from one type to another. Implementations should be stateless and thread safe.
 *
 * @author Graeme Rocher
 * @since 1.0
 * @param <S> The source type
 * @param <T> The target type
 */
public interface TypeConverter<S, T> {

    /**
     * Converts from the given source object type to the target type
     *
     * @param object The object type
     * @param targetType The target type being converted to
     * @return The converted type or empty if the conversion is not possible
     */
    default Optional<T> convert(S object, Class<T> targetType) {
        return convert(object, targetType, Collections.emptyMap());
    };
    /**
     * Converts from the given source object type to the target type
     *
     * @param object The object type
     * @param targetType The target type being converted to
     * @return The converted type or empty if the conversion is not possible
     */
    Optional<T> convert(S object, Class<T> targetType, Map<String, Class> typeArguments);
}
