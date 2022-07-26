#!/usr/bin/env bash

eval $(echo ${QUERY_STRING//&/;})

echo "Content-type:text/html"
echo
echo "<html>"
echo "<head>"
echo "<title>Hello, world!</title>"
echo "</head>"
echo "<body>"
echo "Hello, $name"
echo "</body>"
echo "</html>"
