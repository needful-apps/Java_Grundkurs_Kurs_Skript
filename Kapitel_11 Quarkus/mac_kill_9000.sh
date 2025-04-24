#!/bin/bash
PID=$(lsof -ti:9000)
if [ -n "$PID" ]; then
  echo "Prozess-ID gefunden: $PID"
  kill -9 $PID
  echo "Prozess mit PID $PID wurde beendet."
else
  echo "Kein Prozess läuft auf Port 9000."
fi
