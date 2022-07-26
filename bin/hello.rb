#!/usr/bin/env ruby

require "cgi"
cgi = CGI.new

print "Content-type:text/html\n\n"
print "<html>"
print "<head>"
print "<title>Hello, world!</title>"
print "</head>"
print "<body>"
print "Hello, %s!" % [ cgi['name'] ]
print "</body>"
print "</html>"
