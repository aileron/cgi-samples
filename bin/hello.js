#!/opt/homebrew/bin/node
const querystring = require('querystring')
const name = querystring.parse(process.env['QUERY_STRING'])['name']

process.stdout.write( "Content-type:text/html\n\n" );
process.stdout.write( "<html>\n" );
process.stdout.write( "<head>\n" );
process.stdout.write( "<title>Hello, world!</title>\n" );
process.stdout.write( "</head>\n" );
process.stdout.write( "<body>\n" );
process.stdout.write( `Hello, ${name}!` );
process.stdout.write( "</body>" );
process.stdout.write( "</html>" );
