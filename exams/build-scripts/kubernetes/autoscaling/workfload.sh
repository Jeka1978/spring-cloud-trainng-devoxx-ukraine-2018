#!/bin/bash

while true; do
  curl -H "Content-Type: application/json" \
    -d '{"MATH": 100, "HISTORY": 1000}' \
    -X POST http://localhost:8093/exams-direct/exam
done