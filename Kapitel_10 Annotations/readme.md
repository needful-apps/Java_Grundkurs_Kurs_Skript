# Kapitel: Java Annotations

## Einführung

Java Annotations sind Metadaten, die zusätzliche Informationen zu Programmelementen wie Klassen, Methoden, Variablen, Parametern und Paketen liefern. Sie bieten eine Möglichkeit, den Code mit Metadaten zu versehen, die sowohl zur Compile-Zeit als auch zur Laufzeit verfügbar sein können.

## Grundlagen

Java-Annotationen beginnen mit dem @-Symbol, gefolgt vom Namen der Annotation. Sie können vor Klassen, Methoden, Variablen, Parametern und Paketen platziert werden. Einige gebräuchliche Annotationen, die in Java eingebaut sind, sind:

- `@Override`: Gibt an, dass eine Methode eine Methode aus der Superklasse überschreibt.
- `@Deprecated`: Markiert einen Typ oder eine Methode als veraltet.
- `@SuppressWarnings`: Unterdrückt Compiler-Warnungen für den markierten Codeabschnitt.

Beispiel:

```java
@Override
public String toString() {
    // ...
}

@Deprecated
public void oldMethod() {
    // ...
}
```

## Eigene Annotationen erstellen

Sie können auch Ihre eigenen Annotationen in Java erstellen. Hier ist ein einfaches Beispiel, wie man das macht:

```java
package de.needfulapps;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Speaker annotation is used to annotate classes that represent speakers at a conference.
 * It contains a single name that represents the name of the speaker.
 * At the beginning of the conference, the speaker's name will be printed to the console.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Speaker {
    String name() default "";
}

//...

package de.needfulapps;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Annotator {

    List<Class> registeredClasses = new ArrayList<>();

    public void registerClass(Class clazz) {
        registeredClasses.add(clazz);
    }

    public void prepareAnnotations() {
        try {
            for (Class clazz : registeredClasses) {
                for (Method method : clazz.getDeclaredMethods()) {
                    Annotation[] annotations = method.getDeclaredAnnotations();
                    for (Annotation annotation : annotations) {
                        if (annotation instanceof Speaker) {
                            Speaker speaker = (Speaker) annotation;
                            System.out.println("Speaker: " + speaker.name());
                        }
                    }
                }
            }
        } catch (SecurityException  e) {
            e.printStackTrace();
        }
    }
}

//...

@Speaker(name = "Alex")
public static void printHelloWorldConference() {
    System.out.println("Hello, World");
}
```

## Verwendung von Annotations

Annotationen können während der Compile-Zeit oder zur Laufzeit gelesen werden, je nachdem, wie sie definiert sind. Sie werden häufig in Frameworks wie Spring und Hibernate verwendet, um Konfigurationsdetails direkt im Code anzugeben.

Zum Beispiel verwendet das Spring Framework Annotationen wie `@Component`, `@Service`, `@Repository` und `@Controller`, um Spring-Beans zu definieren. Ebenso wird in JPA (Java Persistence API) und Hibernate die `@Entity`-Annotation verwendet, um anzugeben, dass eine Klasse eine Datenbanktabelle repräsentiert.

## Zusammenfassung

Java-Annotationen sind ein mächtiges Werkzeug, das es ermöglicht, Metadaten direkt im Code zu spezifizieren. Sie können sowohl in eingebauten Java-Funktionen als auch in Drittanbieter-Frameworks wie Spring und Hibernate verwendet werden. Die Fähigkeit, eigene Annotationen zu erstellen, ermöglicht es den Entwicklern zudem, ihren Code auf eine Art und Weise zu konfigurieren, die sowohl lesbar als auch flexibel ist.
