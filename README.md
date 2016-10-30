# ClojureScript Workshop

Repository of related materials to the workshop

## Table of contents

- [Requirements](#requirements)
- [Preparation](#preparation)
- [Links](#links)

## Requirements

You should be familiar with...

- *React.js* library
- State management solutions like *Flux*
- A concept of *immutability*
- Basics of *functional programming*

## Preparation

You have to be prepared for the workshop, so we don't have to waste time for this.

### Java

Make sure you have [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 1.6 or greater.

### Leiningen

Install via *Homebrew*: `brew install leiningen` or [other package managers](https://github.com/technomancy/leiningen/wiki/Packaging).

Or using shell script:

1. Download the [lein script](https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein) (or on Windows [lein.bat](https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein.bat))
2. Place it on your `$PATH` where your shell can find it (eg. `~/bin`)
3. Set it to be executable (`chmod a+x ~/bin/lein`)
4. Run it (`lein`) and it will download the self-install package

Or with [Windows installer](http://leiningen-win-installer.djpowell.net/).

### Readline wrapper

Install rlwrap:

1. Clone the repo: https://github.com/hanslub42/rlwrap
2. Execute

```
./configure
make
make install
```

### Create a project

1. Create a new project `lein new figwheel workshop`
2. Run the project for the first time to install dependencies `cd workshop && rlwrap lein figwheel dev`
3. Once the project is running kill it with `Ctrl+C`

### Configure your editor

#### Atom

Follow [this manual](https://gist.github.com/jasongilman/d1f70507bed021b48625). You don't have to install and configure everything, the important parts are: [Parinfer](https://github.com/oakmac/atom-parinfer) plugin, [language-clojure](https://gist.github.com/jasongilman/d1f70507bed021b48625#language-clojure) settings, [lisp-paredit](https://gist.github.com/jasongilman/d1f70507bed021b48625#lisp-paredit) settings and [Atom Settings](https://gist.github.com/jasongilman/d1f70507bed021b48625#atom-settings) sections.

#### Sublime Text

- [sublime-lispindent](https://github.com/odyssomay/sublime-lispindent)
- [sublime-text-parinfer](https://github.com/oakmac/sublime-text-parinfer)

#### VS Code

- [vscode-parinfer](https://github.com/narma/vscode-parinfer)

#### Vim

- [vim-parinfer](https://github.com/bhurlow/vim-parinfer)
- [vim-fireplace](https://github.com/tpope/vim-fireplace)

## Links

- [Community Resources](http://clojure.org/community/resources)
- [ClojureScript REPL](http://jaredforsyth.com/reepl/)
