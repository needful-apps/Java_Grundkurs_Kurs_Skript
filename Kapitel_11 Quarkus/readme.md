# Einführung in gRPC mit Quarkus

1. __Was ist gRPC?__  
   In diesem Kapitel lernen wir, was gRPC ist und wie es uns hilft, robuste und performante Kommunikationsschnittstellen zwischen verschiedenen Services zu erstellen. gRPC (Remote Procedure Call) ist ein Open-Source-Framework, das auf HTTP/2 basiert und Protokolldateien verwendet, um Schnittstellen und Nachrichten zu definieren. Es ermöglicht die Kommunikation zwischen Diensten in verschiedenen Programmiersprachen.

2. __Vorteile von gRPC__  
   Wir sehen uns die Vorteile von gRPC im Vergleich zu traditionellen REST-APIs an:
   * **Effizienz**: gRPC verwendet HTTP/2, was eine effiziente Übertragung und Kompression von Daten ermöglicht.
   * **Mehrere Kommunikationsmodi**: Neben einfachen Anfragen und Antworten unterstützt gRPC auch Streaming.
   * **Spracheunabhängigkeit**: Mit Protobuf (Protocol Buffers) können wir Schnittstellen definieren, die in mehreren Sprachen verwendet werden können.

3. Aufbau einer Proto-Datei
   Eine zentrale Komponente von gRPC ist die Protobuf-Datei, in der wir unsere Schnittstellen und Datenstrukturen definieren. Protobuf (Protocol Buffers) ist ein kompaktes und effizientes Serialisierungsformat, das von gRPC genutzt wird. Die Protobuf-Datei beschreibt die Struktur der Nachrichten und die gRPC-Methoden.

Lassen Sie uns eine einfache Protobuf-Datei betrachten:  

__Beispiel__: Protobuf-Datei hello.proto

```protobuf
syntax = "proto3"; // Wir verwenden die aktuelle Protobuf-Syntax.

package org.example; // Definiert den Namespace unserer gRPC-Dienste.

// Definition des gRPC-Dienstes.
service HelloService {
// Eine Methode, die eine Begrüßung zurückgibt.
rpc SayHello (HelloRequest) returns (HelloResponse);
}

// Definition der Anfrage-Nachricht.
message HelloRequest {
string name = 1; // Das Feld "name" erwartet eine Zeichenkette.
}

// Definition der Antwort-Nachricht.
message HelloResponse {
string message = 1; // Das Feld "message" enthält die Begrüßung.
}
```

__Aufbau der Protobuf-Datei__  
`syntax = "proto3";`  
Wir legen fest, dass wir die Protobuf-Syntax 3 verwenden. Diese Version ist aktuell und bringt einige Verbesserungen im Vergleich zu älteren Versionen mit.

`package org.example;`  
Mit dem package-Schlüsselwort definieren wir den Namespace für die generierten Klassen. Das hilft, Namenskollisionen zu vermeiden.

__Service-Definition (service)__  
Hier definieren wir den gRPC-Dienst `HelloService` und die darin enthaltene Methode `SayHello`. Die Methode erwartet eine Nachricht vom Typ `HelloRequest` und liefert eine Antwort vom Typ `HelloResponse`.

__Message-Typen (message)__  

`HelloRequest`  enthält ein Feld `name` vom Typ `string`.  
`HelloResponse` enthält ein Feld `message`, das ebenfalls vom Typ `string` ist.  

__Erklärung der Syntax__  
Jedes Feld hat eine Nummer (z. B. 1), die für die Serialisierung verwendet wird.  
Diese Nummern müssen eindeutig innerhalb der Nachricht sein.  

Protobuf unterstützt primitive Typen wie `string, int32, bool` sowie komplexe Typen (verschachtelte Nachrichten).

4. __Generierung von Code__  
   https://code.quarkus.io/






